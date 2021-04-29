package matematica.problem1169

object Main {

  def stringToLong(lineInput: String): Array[Long] = {
    val entradas = lineInput.split(" ").
      map(_a => _a.trim.replace(",", ".")).
      filter(_b => _b.nonEmpty).map(_c => _c.toLong)
    entradas
  }

  def main(args: Array[String]): Unit = {
    var quantidade = io.StdIn.readInt()
    for (i <- (1 to quantidade)) {
      val valores = stringToLong(io.StdIn.readLine())
      var l : BigInt = 1L
      l = l << valores(0).toInt
      l /= 12000L
      print("%s kg\n".format(l.toString()))
    }
  }
}
