package matematica.problem1028

object Main {

  def mdc(m: Long, n: Long): Long = {
    if (n == 0L)
      return m

    mdc(n, m % n)
  }

  def stringToLong(lineInput: String): Array[Long] = {
    val entradas = lineInput.split(" ").
      map(_a => _a.trim.replace(",", ".")).
      filter(_b => _b.nonEmpty).map(_c => _c.toLong)
    entradas
  }


  def main(args: Array[String]): Unit = {
    var quantidade = io.StdIn.readLong()
    for(i <- (1 to quantidade.toInt)){
      val valores = stringToLong(io.StdIn.readLine())
      println(mdc(valores(0),valores(1)))
    }

  }
}
