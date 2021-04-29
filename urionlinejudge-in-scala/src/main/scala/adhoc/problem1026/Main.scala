package adhoc.problem1026

object Main {

  def somaSemCary(vals: String): String = {
    val valores = stringToLong(vals)
    "%d\n".format(somaSemCary(valores(0), valores(1)))
  }

  def somaSemCary(val1: Long, val2: Long): Long = {
    val1 ^ val2
  }

  def stringToLong(lineInput: String): Array[Long] = {
    val entradas = lineInput.split(" ").
      map(_a => _a.trim).
      filter(_b => _b.nonEmpty).
      map(_c => _c.toLong)
    entradas
  }


  def main(args: Array[String]) {
    var line: String = ""
    var loop = true
    while (loop) {
      line = io.StdIn.readLine()
      if (line != null && line.trim.nonEmpty)
        print(somaSemCary(line))
      else
        loop = false
    }
  }

}
