package matematica.problem1212

import math._
import scala.io.StdIn

object Main {

  def contaVaiUmTodosDigitos(n1: Long, n2: Long): Int = {

    val contaDigitos = ceil(log10(max(n1, n2))).toInt
    var vemUm: Short = 0
    var ret: Int = 0
    for (digito <- (0 until contaDigitos)) {
      val valDigitoAtual = somaDigito(n1, n2, digito, vemUm)
      ret += {
        if (valDigitoAtual > 9) 1 else 0
      }
      vemUm = (valDigitoAtual / 10).toShort
    }
    ret
  }

  def somaDigito(n1: Long, n2: Long, digito: Int, vemUm: Short = 0.toShort): Short = {
    val p1: Short = ((n1 / math.pow(10, digito)).toLong % 10L).toShort
    val p2: Short = ((n2 / math.pow(10, digito)).toLong % 10L).toShort
    (p1 + p2 + vemUm).toShort
  }

  def main(args: Array[String]): Unit = {
    var continue: Boolean = true
    while (continue) {
      val input = StdIn.readLine().trim.split(" ")
      continue = (input.length == 2 && (input(0) != "0" || input(1) != "0"))
      if (continue) {
        val qd = contaVaiUmTodosDigitos(input(0).toLong, input(1).toLong).toInt
        qd match {
          case 0 => println("No carry operation.")
          case 1 => println("1 carry operation.")
          case _ => println(qd + " carry operations.")
        }
      } else {
        //println("")
      }
    }
  }
}
