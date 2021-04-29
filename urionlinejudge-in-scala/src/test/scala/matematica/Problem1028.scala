package matematica

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class Problem1028 extends AnyFlatSpec with should.Matchers{

  matematica.problem1028.Main.mdc(317811, 514229) should equal (1L)

}
