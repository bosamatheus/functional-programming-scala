package chapter02

/**
 * Let's look at another example, currying, which converts a
 * function of N arguments into a function of one argument that returns another
 * function as its result. Here again, there is only one implementation that typechecks.
 */
object Exercise04 {

    def curry[A, B, C](f: (A, B) => C): A => (B => C) =
        (a: A) => ((b: B) => f(a, b)) // it works too: (a: A) => (b: B) => f(a, b)
}
