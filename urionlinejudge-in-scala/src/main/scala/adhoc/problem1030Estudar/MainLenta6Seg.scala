package adhoc.problem1030Estudar

import scala.collection.mutable.Map

object MainLenta6Seg {

  /***
   * Cria um Map com o número da pessoa e as marcações se morreu(true) ou está vivo (false). Inicia vivo
   * @param tamanhoLista
   * @return
   */
  def montaListaPessoas(tamanhoLista: Int): Map[Int, Boolean] = {
    val ret = collection.mutable.Map[Int, Boolean]()
    (1 to tamanhoLista by 1).foreach({
      ret put(_, false)
    })
    ret
  }

  /***
   * Da lista apresentada retorna a quantidade de pessoa que morreram.
   * @param pessoas
   * @return
   */
  def contaQuantosMorreram(pessoas: collection.mutable.Map[Int, Boolean]): Int = {
    pessoas.filter(x => x._2).size
  }

  /***
   * Pega o número da última pessoa viva, no fim do processamento.
   * @param pessoas
   * @return
   */
  def pegaUltimoVivo(pessoas: collection.mutable.Map[Int, Boolean]): Int = {
    pessoas.filter( x => x._2 == false).head._1 // Pega o último vivo.
  }

  /** *
   * Conta os itens de forma recursiva de forma que evolui a posicao atual até a quantidade de itens para pular seja 0
   *
   * @param pessoas
   * @param posAtual
   * @param itensParaPula
   * @return
   */
  def pulaItem(pessoas: Map[Int, Boolean], posAtual: Int, itensParaPula: Int): Int = {

    if (itensParaPula == 0) {
      pessoas(posAtual) = true // morreu ;-(
      return posAtual
    }

    val proximaPosicao: Int = (posAtual % pessoas.size) + 1

    if (pessoas(proximaPosicao)) // Pega se a pessoa esta morta ou nao (true = morta)
      return pulaItem(pessoas, proximaPosicao, itensParaPula)
    else
      return pulaItem(pessoas, proximaPosicao, itensParaPula - 1)
  }

  def stringToDouble(lineInput: String): Array[Int] = {
    val entradas = lineInput.split(" ").
      map(_a => _a.trim.replace(",", ".")).
      filter(_b => _b.nonEmpty).map(_c => _c.toInt)
    entradas
  }

  def main(args: Array[String]) {

    val contagem = io.StdIn.readLine().trim.toInt

    for (elem <- (1 to contagem)) {

      val x = stringToDouble(io.StdIn.readLine())
      val tamanhoLista = x(0)
      val pulaLista = x(1)
      var lista = montaListaPessoas(tamanhoLista)

      // Marca o primeiro morreu
      lista(pulaLista)=true // Mata o primeiro
      var proximaPosicao = pulaLista

      (1 to lista.size - 2).foreach((a) => {
        proximaPosicao = pulaItem(lista, proximaPosicao, pulaLista)
      })

      print("case %d: %d\n".format(elem, pegaUltimoVivo(lista)))
    }
  }
}
