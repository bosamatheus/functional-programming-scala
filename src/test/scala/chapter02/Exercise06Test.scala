package chapter02

import org.scalatest.{Matchers, FunSuite}

class Exercise06Test extends FunSuite with Matchers {

  test("compose should compose two functions") {
    val compFunc = Exercise06.compose((x: Double) => x * 2, (y: Double) => y / 2)
    compFunc(10) should be (10)
  }
}
