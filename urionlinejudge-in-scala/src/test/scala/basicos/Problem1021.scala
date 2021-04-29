package basicos

import org.scalatest.flatspec._
import org.scalatest.matchers._

class Problem1021 extends AnyFlatSpec with should.Matchers {

  "A rotina" should "contabilizar correto para 576,73" in {
    basicos.problem1021.Main.init()
    basicos.problem1021.Main.preencheContagemValores(576.73, 0)
    assert(basicos.problem1021.Main.imprimeContagemValores("", 0) ==
      "NOTAS:\n5 nota(s) de R$ 100.00\n1 nota(s) de R$ 50.00\n1 nota(s) de R$ 20.00\n0 nota(s) de R$ 10.00\n1 nota(s) de R$ 5.00\n0 nota(s) de R$ 2.00\nMOEDAS:\n1 moeda(s) de R$ 1.00\n1 moeda(s) de R$ 0.50\n0 moeda(s) de R$ 0.25\n2 moeda(s) de R$ 0.10\n0 moeda(s) de R$ 0.05\n3 moeda(s) de R$ 0.01\n")
  }


  "A rotina" should "contabilizar correto para 4,00" in {
    basicos.problem1021.Main.init()
    basicos.problem1021.Main.preencheContagemValores(4.0, 0)
    assert(basicos.problem1021.Main.imprimeContagemValores("", 0) ==
      "NOTAS:\n0 nota(s) de R$ 100.00\n0 nota(s) de R$ 50.00\n0 nota(s) de R$ 20.00\n0 nota(s) de R$ 10.00\n0 nota(s) de R$ 5.00\n2 nota(s) de R$ 2.00\nMOEDAS:\n0 moeda(s) de R$ 1.00\n0 moeda(s) de R$ 0.50\n0 moeda(s) de R$ 0.25\n0 moeda(s) de R$ 0.10\n0 moeda(s) de R$ 0.05\n0 moeda(s) de R$ 0.01\n")
  }

  "A rotina 11,14 " should "contabilizar correto para 11,14" in {
    basicos.problem1021.Main.init()
    basicos.problem1021.Main.preencheContagemValores(11.14, 0)
    assert(basicos.problem1021.Main.imprimeContagemValores("", 0) == "NOTAS:\n0 nota(s) de R$ 100.00\n0 nota(s) de R$ 50.00\n0 nota(s) de R$ 20.00\n1 nota(s) de R$ 10.00\n0 nota(s) de R$ 5.00\n0 nota(s) de R$ 2.00\nMOEDAS:\n1 moeda(s) de R$ 1.00\n0 moeda(s) de R$ 0.50\n0 moeda(s) de R$ 0.25\n1 moeda(s) de R$ 0.10\n0 moeda(s) de R$ 0.05\n4 moeda(s) de R$ 0.01\n")
  }

  "A rotina 11,15 " should "contabilizar correto para 11,15" in {
    basicos.problem1021.Main.init()
    basicos.problem1021.Main.preencheContagemValores(11.15, 0)
    assert(basicos.problem1021.Main.imprimeContagemValores("", 0) == "NOTAS:\n0 nota(s) de R$ 100.00\n0 nota(s) de R$ 50.00\n0 nota(s) de R$ 20.00\n1 nota(s) de R$ 10.00\n0 nota(s) de R$ 5.00\n0 nota(s) de R$ 2.00\nMOEDAS:\n1 moeda(s) de R$ 1.00\n0 moeda(s) de R$ 0.50\n0 moeda(s) de R$ 0.25\n1 moeda(s) de R$ 0.10\n1 moeda(s) de R$ 0.05\n0 moeda(s) de R$ 0.01\n")
  }

  "A rotina executa entre 0.10 a 17.0 " should "contabilizar correto" in {
    (0.1 to 3700.0 by 0.01).foreach(a => {
      // println("testando " + a)
      basicos.problem1021.Main.init()
      basicos.problem1021.Main.preencheContagemValores(a, 0)
      assert(basicos.problem1021.Main.somaValores() - a < 0.001)
    })
  }

  "A rotina 91.01 " should "contabilizar " in {
    basicos.problem1021.Main.init()
    basicos.problem1021.Main.preencheContagemValores(91.01, 0)
    assert(basicos.problem1021.Main.imprimeContagemValores("", 0) == "NOTAS:\n0 nota(s) de R$ 100.00\n1 nota(s) de R$ 50.00\n2 nota(s) de R$ 20.00\n0 nota(s) de R$ 10.00\n0 nota(s) de R$ 5.00\n0 nota(s) de R$ 2.00\nMOEDAS:\n1 moeda(s) de R$ 1.00\n0 moeda(s) de R$ 0.50\n0 moeda(s) de R$ 0.25\n0 moeda(s) de R$ 0.10\n0 moeda(s) de R$ 0.05\n1 moeda(s) de R$ 0.01\n")
  }

}