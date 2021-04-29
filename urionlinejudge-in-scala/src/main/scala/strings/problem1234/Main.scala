package strings.problem1234


object Main {


  def ehMinuscula(chr: Char): Boolean = {
    chr >= 'a' && chr <= 'z'
  }

  def ehMaiuscula(chr: Char): Boolean = {
    chr >= 'A' && chr <= 'Z'
  }

  def convMaiuscula(chr: Char): Char = {
    (chr - 32).toChar
  }

  def convMinuscula(chr: Char): Char = {
    (chr + 32).toChar
  }

  def converteParaDancing(str: String): String = {

    var ret = new StringBuilder()
    var maiusculo: Boolean = true
    for (chi <- str.chars().toArray) {
      val chr: Char = chi.toChar
      if (maiusculo) {
        if (ehMinuscula(chr)) {
          ret.append(convMaiuscula(chr))
        } else {
          ret.append(chr)
        }
      } else {
        if (ehMaiuscula(chr)) {
          ret.append(convMinuscula(chr))
        } else {
          ret.append(chr)
        }
      }
      if (chr != ' ') {
        maiusculo = !maiusculo
      }
    }
    ret.toString()
  }

  def main(args: Array[String]): Unit = {

    var line: String = ""
    var loop = true
    while (loop) {
      line = io.StdIn.readLine()
      if (line != null ) {
        val strDancing = converteParaDancing(line)
        //if (strDancing == line) {
        //  print(enter + "ThIs Is A dAnCiNg SeNtEnCe")
        //} else {
          println(strDancing)
        //}
      }
      else {
        loop = false
      }
    }

  }

}
