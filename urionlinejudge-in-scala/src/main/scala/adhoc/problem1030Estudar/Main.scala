package adhoc.problem1030Estudar

import java.util

object Main {

  /** *
   * Cria um Map com o número da pessoa e as marcações se morreu(true) ou está vivo (false). Inicia vivo
   *
   * @param tamanhoLista
   * @return
   */
  def montaListaPessoas(tamanhoLista: Int): Array[Boolean] = {
    new Array[Boolean](tamanhoLista)
  }

  /** *
   * Conta os itens de forma recursiva de forma que evolui a posicao atual até a quantidade de itens para pular seja 0
   *
   * @param pessoas
   * @param posAtual
   * @param itensParaPula
   * @return
   */
  def pulaItem(pessoas: Array[Boolean], posAtual: Int, itensParaPula: Int): Int = {

    if (itensParaPula == 0) {
      pessoas(posAtual) = true // morreu ;-(
      return posAtual
    }

    val proximaPosicao: Int = (posAtual + 1) % pessoas.size

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
      val saltoNaLista = x(1)

      var lista = montaListaPessoas(tamanhoLista)
      var proximaPosicao = saltoNaLista-1
      // Marca o primeiro morreu
      lista(proximaPosicao) = true // Mata o primeiro
      (1 to lista.size - 1).foreach((a) => {
        proximaPosicao = pulaItem(lista, proximaPosicao, saltoNaLista)
        // println(proximaPosicao + 1)
      })
      print("case %d: %d\n".format(elem, proximaPosicao+1))
      // print(util.Arrays.toString(lista))
    }
  }
}
