package adhoc

import org.scalatest.flatspec._
import org.scalatest.matchers._

class Problem1026 extends AnyFlatSpec with should.Matchers {

  adhoc.problem1026.Main.somaSemCary(4,6) should equal(2)
  adhoc.problem1026.Main.somaSemCary(9,6) should equal(15)
  //adhoc.problem1026.Main.somaSemCary(0xdf6L,0xea3L) should equal(0x255)
  adhoc.problem1026.Main.somaSemCary(3574,3747) should equal(853)
  adhoc.problem1026.Main.somaSemCary("4   6") should equal(2)

}