package demo.monad

trait M[A] {
  /**
   * def flatMap[B](f: (A) => U[B]): U[B]
   *  U is a List.
   * @param f
   * @tparam B
   * @return
   */



  def flatMap[B](f: A=>M[B]):M[B]
}
//def unit[A](x: A): M[A]