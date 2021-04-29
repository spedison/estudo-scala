package basicos.problem1005

object Main {

  def calcula(A:Double, B:Double): Double = {
    (3.5 * A + 7.5 * B) / 11.0
  }

  def calculaString(A:Double, B:Double) : String = {
    val med = calcula(A,B)
    "MEDIA = %.5f".format(med).replace(",",".")
  }

  def main(args: Array[String]) {
      val A = io.StdIn.readLine().toDouble
      val B = io.StdIn.readLine().toDouble
      println(calculaString(A,B))
  }

}
