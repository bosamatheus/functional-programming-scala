package chapter02

import org.scalatest.{Matchers, FunSuite}

class Exercise02Test extends FunSuite with Matchers {

  val gtFunc = (x: Int, y: Int) => y > x

  test("isSorted should detect that an array is sorted") {
    Exercise02.isSorted(Array(1, 2, 3, 4, 5), gtFunc) should be (true)
  }

  test("isSorted should detect that an array is not sorted") {
    Exercise02.isSorted(Array(1, 3, 2, 5, 4), gtFunc) should be (false)
  }

  test("isSorted should detect that an array with one element is sorted") {
    Exercise02.isSorted(Array(1), gtFunc) should be (true)
  }
}
