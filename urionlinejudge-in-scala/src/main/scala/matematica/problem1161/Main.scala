package matematica.problem1161


object Main {

  def stringToLongInt(lineInput: String): Array[Long] = {
    val entradas = lineInput.split(" ").
      map(_a => _a.trim.replace(",", ".")).
      filter(_b => _b.nonEmpty).map(_c => _c.toLong)
    entradas
  }

  def fatorial(n: BigInt): BigInt = {
    if (n <= BigInt.int2bigInt(1) ) return 1
    n * fatorial(n - 1)
  }

  def main(args: Array[String]): Unit = {
    var line: String = ""
    var loop = true
    while (loop) {
      line = io.StdIn.readLine()
      if (line != null && line.trim.nonEmpty) {
        val vals = stringToLongInt(line)
        println( fatorial(BigInt.long2bigInt(vals(0))) + fatorial(BigInt.long2bigInt(vals(1))))
      }
      else
        loop = false
    }
  }
}
