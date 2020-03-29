import org.scalatest.{Matchers, FunSuite}

/** @version 1.4.0 */
class Chapter2Test extends FunSuite with Matchers {

    test("stating something") {
        Chapter2.fib(1) should be(1)
    }
}