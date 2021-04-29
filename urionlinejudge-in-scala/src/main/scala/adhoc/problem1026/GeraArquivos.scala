package adhoc.problem1026

import java.io.{File, PrintWriter}
import scala.io._
import math._

object GeraArquivos {

  def main(args: Array[String]): Unit = {

    val entrada = new PrintWriter(new File("/mnt/dados/git/urionlinejudge-in-scala/arquivos/entrada1026"))
    val saida = new PrintWriter(new File("/mnt/dados/git/urionlinejudge-in-scala/arquivos/saida1026"))

    (1 to 750000).foreach(_ -> {
      val val1 = (random() * 100000000D).toLong
      val val2 = (random() * 100000000D).toLong
      entrada.println("%d %d".format(val1, val2))
      saida.println(Main.somaSemCary(val1, val2))
    })

    entrada.close()
    saida.close()
  }


}
