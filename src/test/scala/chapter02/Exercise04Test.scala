package chapter02

import org.scalatest.{Matchers, FunSuite}

class Exercise04Test extends FunSuite with Matchers {

  test("curry should multiply two numbers") {
    val curryFunc = Exercise04.curry((x: Int, y: Int) => x * y)
    curryFunc(2)(3000) should be (6000)
  }
}
