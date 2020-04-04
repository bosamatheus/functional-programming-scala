package chapter02

/**
 * Implement isSorted, which checks whether an Array[A] is sorted
 * according to a given comparison function.
 */
object Exercise02 {

  def isSorted[A](as: Array[A], gt: (A, A) => Boolean): Boolean = {

    @annotation.tailrec
    def go(n: Int): Boolean = {
      if (n >= as.length) true
      else if (gt(as(n - 1), as(n))) go(n + 1)
      else false
    }

    go(1)
  }
}
