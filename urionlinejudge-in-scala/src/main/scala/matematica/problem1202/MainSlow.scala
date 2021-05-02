package matematica.problem1202

object MainSlow {

  def fibo (n:Long):Long = {
    if (n == 1 || n == 2)
      1L
    else
      fibo (n-1) + fibo(n-2)
  }

  def convBinToDec(binario:String):Long = {
    java.lang.Long.parseLong(binario,2)
  }

  def main(args: Array[String]): Unit = {
    val contador = io.StdIn.readInt()
    for ( i <- (1 to contador)) {
      val valDec = convBinToDec(io.StdIn.readLine().trim)
      println("%03d".format(fibo(valDec)))
    }
  }
}
