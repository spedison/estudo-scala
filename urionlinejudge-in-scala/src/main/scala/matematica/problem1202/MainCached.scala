package matematica.problem1202

object MainCached {

  class DadosPosicao(val posicao: BigInt = 1, val v1: BigInt = 0, val v2: BigInt = 0) {
    /*def ==(posicao: Long) = {
      if ((this.posicao == 1 || this.posicao == 2) && (posicao == 1 || posicao == 2)) true else this.posicao == posicao
    }*/
    def valor: BigInt = if (posicao == 1 || posicao == 2) 1 else v1 + v2
    def sorteio: Long = (valor % 1000).toLong
    override def toString: String = super.toString + " { posicao " + posicao + "; valor = " + valor + "; v1 = " + v1 + "; v2 = " + v2 + " } "
  }

  import scala.collection.mutable.HashMap

  val cache: HashMap[Long, DadosPosicao] = HashMap(1L -> new DadosPosicao(1), 2L -> new DadosPosicao(2))

//  def buscaPrimeiraMenorLong(n: Long, vals: Array[Long]): Option[Long] = {
//
//    // println(s"Processando : $n , ${java.util.Arrays.toString(vals)}")
//
//    if (vals.isEmpty | vals(0) > n) { // Se o cache for vazio, paciência, não loclaizado.
//      None
//    }
//    else {
//      if (vals(vals.length - 1) < n) { // Se o último é menor do que procurado, então ele é a solução desse problema.
//        Some(vals(vals.length - 1))
//      } // Se o primeiro valor já foi maior que o valor que preciso, também não localizei
//      else {
//        // Vamos partir a lista até achar o menor mais próximo
//        //* Posicao
//        val posInferior = (0, (vals.size / 2) - 1)
//        val posSuperior = (vals.size / 2, vals.size - 1)
//        //* Valores
//        val valInferior = (vals(posInferior._1), vals(posInferior._2))
//        val valSuperior = (vals(posSuperior._1), vals(posSuperior._2))
//        n match {
//          // Verifica as bordas.
//          case valInferior._1 => Some(valInferior._1)
//          case valInferior._2 => Some(valInferior._2)
//          case valSuperior._1 => Some(valSuperior._1)
//          case valSuperior._2 => Some(valSuperior._2)
//          // Está no meio...
//          case _ => {
//            // Se o valor está entre a divisão, vale o menor.
//            if (n > valInferior._2 && n < valSuperior._1)
//              Some[Long](valInferior._2) // Eis a resposta!
//            else if (n < valInferior._2) { // Escolhe um dos 2 trechos para realizar novamente a busca.
//              buscaPrimeiraMenorLong(n, vals.slice(posInferior._1, posInferior._2)) // Busca com um array menor.
//            } else {
//              buscaPrimeiraMenorLong(n, vals.slice(posSuperior._1, posSuperior._2))
//            }
//          }
//        }
//      }
//    }
//  }

//  def buscaPrimeiraMenor(n: Long): DadosPosicao = {
//    // Cache Vazio
//    if (cache.size == 0) {
//      new DadosPosicao()
//    } else { // Tem dados no cache
//      // Pega a lista de chaves e ordena para fazer a busca binária.
//      var valoresInteiros: Array[Long] = cache.keySet.toArray
//      valoresInteiros = valoresInteiros.sortWith(_ < _)
//      val valLongPrimeiroMenor: Option[Long] = buscaPrimeiraMenorLong(n, valoresInteiros)
//      if (valoresInteiros.isEmpty) {
//        new DadosPosicao()
//      } else {
//        cache(valLongPrimeiroMenor.get)
//      }
//    }
//  }

  def fibo(n: Long): DadosPosicao = {
    cache.getOrElse(n, {
      val p1 = fibo(n - 1)
      val p2 = fibo(n - 2)
      val ret = new DadosPosicao(n, p1.valor, p2.valor)
      cache.put(n, ret)
      ret
    })
  }

//  def fibo(n: Long): Long = {
//    if (n == 1 || n == 2)
//      1L
//    else
//      fibo(n - 1) + fibo(n - 2)
//  }

  def convBinToDec(binario: String): Long = {
    java.lang.Long.parseLong(binario, 2)
  }

//  def main2(args: Array[String]): Unit = {
//    val contador = io.StdIn.readInt()
//    for (i <- (1 to contador)) {
//      val valDec = convBinToDec(io.StdIn.readLine().trim)
//      println("%03d".format(fibo(valDec)))
//    }
//  }

  def main(args: Array[String]): Unit = {
    val contador = io.StdIn.readInt()
    val inicio = System.currentTimeMillis()
    for (i <- (1 to contador)) {
      val valDec = convBinToDec(io.StdIn.readLine().trim)
      //val primeiroMenor: DadosPosicao = buscaPrimeiraMenor(valDec)
      // println("%03d".format(fibo(valDec, primeiroMenor).valor))
      println("dec(%d)%s".format(valDec,fibo(valDec).valor.toString()))
      println("Cache de tamanho :" + cache.size)
      // println("Cache : " + cache.toString())
    }
    val tempo = System.currentTimeMillis() - inicio
    println(s"Tempo gasto é $tempo")
  }
}
