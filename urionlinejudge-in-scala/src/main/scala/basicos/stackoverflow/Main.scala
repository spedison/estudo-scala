package basicos.stackoverflow

object Main {

  def mainStack(n: Long): Long = {
    println("Passando aqui : " + n)
    if (n == 0) n
    else mainStack(n - 1)
  }

  def main(args: Array[String]): Unit = {

    mainStack(1000000000)

  }


}
