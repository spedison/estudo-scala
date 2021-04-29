package basicos

import org.scalatest._
import org.scalatest.flatspec._
import org.scalatest.matchers._

import scala.collection.mutable.Stack

class Problem1005 extends AnyFlatSpec with should.Matchers {

  basicos.problem1005.Main.calcula(10.0, 10.0) should equal(10.0)

  basicos.problem1005.Main.calculaString(5.0, 7.1) should equal("MEDIA = 6.43182")

  basicos.problem1005.Main.calculaString(0.0, 7.1) should equal("MEDIA = 4.84091")

  basicos.problem1005.Main.calculaString(10.0, 10.0) should equal("MEDIA = 10.00000")


  "A Stack" should "pop values in last-in-first-out order" in {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    stack.pop() should be(2)
    stack.pop() should be(1)
  }

  it should "throw NoSuchElementException if an empty stack is popped" in {
    val emptyStack = new Stack[Int]
    a[NoSuchElementException] should be thrownBy {
      emptyStack.pop()
    }
  }
}