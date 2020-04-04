package chapter02

import org.scalatest.{Matchers, FunSuite}

class Exercise03Test extends FunSuite with Matchers {

  test("partial1 should increment a given number") {
    val partial1Func = Exercise03.partial1(1, (x: Int, y: Int) => x + y)
    partial1Func(2) should be (3)
  }
}
