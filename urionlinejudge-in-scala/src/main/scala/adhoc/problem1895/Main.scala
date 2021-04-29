package adhoc.problem1895

object Main {

  def stringToInt(lineInput: String): Array[Int] = {
    val entradas = lineInput.split(" ").
      map(_a => _a.trim.replace(",", ".")).
      filter(_b => _b.nonEmpty).map(_c => _c.toInt)
    entradas
  }

  def main(args: Array[String]): Unit = {
    val dados = stringToInt(io.StdIn.readLine())
    val N = dados(0)
    var T = dados(1)
    val L = dados(2)
    var pontua: Array[Int] = Array(0, 0)
    var jogador = 0
    for (i: Int <- 0 to N - 2) {
      jogador = i % 2
      val CAtual: Int = io.StdIn.readInt()
      if (math.abs(CAtual - T) <= L) {
        pontua(jogador) += math.abs(CAtual - T)
        T = CAtual
      }
    }
    print("%d %d\n".format(pontua(0), pontua(1)))
  }
}
