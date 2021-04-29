package basicos.problem1021

object Main {

  val valoresADescontar = Array(100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, .5, .25, .10, .05, .01)
  var contagemValores = Array[Int](0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

  def init(): Unit = {
    contagemValores = Array[Int](0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
  }

  def somaValores():Double = {
    var acc = 0.0D
    (0 to contagemValores.length-1).foreach( a => {
      acc = acc + contagemValores(a) * valoresADescontar(a)
    })
    acc
  }

  def preencheContagemValores(valor: Double, posicao: Int): Unit = {

    if (posicao >= valoresADescontar.length)
      return

    if (valor < valoresADescontar(posicao)) {
      preencheContagemValores(valor, posicao + 1)
      return
    }

    contagemValores(posicao) = (valor / valoresADescontar(posicao).toDouble).toInt
    // Problemas de arredondamento com 0.16. Talvez o mais simples seja tratalhar com inteiros. (Val*100)
    val restante = ((valor - (valoresADescontar(posicao) * contagemValores(posicao)) + 0.001) * 100.00).toInt.toDouble / 100.00D

    if (restante >= 0.01)
      preencheContagemValores(restante, posicao + 1)

  }

  def imprimeContagemValores(anterior: String, posicao: Int): String = {
    var ret: String = anterior

    if (posicao >= valoresADescontar.length) {
      return ret
    }

    if (posicao == 0) {
      ret += "NOTAS:\n"
    } else if (posicao == 6) {
      ret += "MOEDAS:\n"
    }

    ret += contagemValores(posicao).toString + " "
    if (posicao >= 0 && posicao <= 5) {
      ret += "nota(s) de R$ %.2f\n".format(valoresADescontar(posicao)).replace(",", ".")
    } else {
      ret += "moeda(s) de R$ %.2f\n".format(valoresADescontar(posicao)).replace(",", ".")
    }

    imprimeContagemValores(ret, posicao + 1)
  }

  def main(args: Array[String]): Unit = {
    val A = io.StdIn.readLine().toDouble
    init()
    preencheContagemValores(A, 0)
    print(imprimeContagemValores("", 0))
  }

}
