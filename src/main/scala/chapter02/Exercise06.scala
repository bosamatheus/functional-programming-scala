package chapter02

/**
 * Implement the higher-order function that composes two functions.
 */
object Exercise06 {

    def compose[A, B, C](f: B => C, g: A => B): A => C =
        (a: A) => f(g(a))
}
