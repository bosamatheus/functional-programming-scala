package chapter02

import org.scalatest.{Matchers, FunSuite}

class Exercise01Test extends FunSuite with Matchers {

    test("fib should return the correct Fibonacci numbers") {
        Exercise01.fib(0) should be (0)
        Exercise01.fib(1) should be (1)
        Exercise01.fib(2) should be (1)
        Exercise01.fib(3) should be (2)
        Exercise01.fib(4) should be (3)
        Exercise01.fib(5) should be (5)
        Exercise01.fib(6) should be (8)
        Exercise01.fib(7) should be (13)
        Exercise01.fib(8) should be (21)
        Exercise01.fib(9) should be (34)
        Exercise01.fib(10) should be (55)
        Exercise01.fib(11) should be (89)
        Exercise01.fib(12) should be (144)
    }
}
