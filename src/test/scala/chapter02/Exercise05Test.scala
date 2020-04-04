package chapter02

import org.scalatest.{Matchers, FunSuite}

class Exercise05Test extends FunSuite with Matchers {

  test("uncurry should divide two numbers") {
    val uncurryFunc = Exercise05.uncurry((x: Int) => (y: Int) => x / y)
    uncurryFunc(4, 2) should be (2)
  }
}
