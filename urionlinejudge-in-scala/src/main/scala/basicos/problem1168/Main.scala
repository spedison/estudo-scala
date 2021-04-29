package basicos.problem1168

object Main {

  val contagens: Map[Char, Int] =
    Map[Char, Int](
      '1' -> 2, '2' -> 5, '3' -> 5,
      '4' -> 4, '5' -> 5, '6' -> 6, '7' -> 3,
      '8' -> 7, '9' -> 6, '0' -> 6)

  def contaLeds(numeros: String): Int = {

    var acc: Int = 0
    numeros.toCharArray.foreach(u => {
      acc += contagens(u)
    })
    acc
  }

  def imprimeLeds(numeros: String): String = {
    "%d leds\n".format(contaLeds(numeros))
  }

  def main(args: Array[String]): Unit = {
    (1 to io.StdIn.readLine().toInt).foreach(
      _ => {
        print(imprimeLeds(io.StdIn.readLine()))
      }
    )
  }

}
