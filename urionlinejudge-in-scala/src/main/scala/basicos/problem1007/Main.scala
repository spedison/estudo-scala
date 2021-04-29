package basicos.problem1007

object Main {

  def calcula(A: Int, B: Int, C: Int, D: Int): Int = {
    (B * A - C * D)
  }

  def calculaString(A: Int, B: Int, C: Int, D: Int): String = {
    val med = calcula(A, B, C, D)
    "DIFERENCA = %d".format(med)
  }

  def main(args: Array[String]) {
    val A = io.StdIn.readLine().toInt
    val B = io.StdIn.readLine().toInt
    val C = io.StdIn.readLine().toInt
    val D = io.StdIn.readLine().toInt
    println(calculaString(A, B, C, D))
  }

}
