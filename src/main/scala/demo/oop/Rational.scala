package oop

class Rational(n: Int,d :Int) {
  require(d != 0)

  private val g = gcd(n.abs,d.abs)

  val numer : Int = n / g
  val denom : Int = d / g

  def this(n:Int) = this(n,1) // auxiliary constructor

  override def toString: String = numer + "/" +denom

  private def gcd(a:Int,b:Int):Int =
    if (b == 0) a else  gcd(b,a%b)

  def +(that: Rational):Rational =
    new Rational(
      numer * that.denom + that.numer*denom,
      denom * that.denom
    )

  def +(i :Int):Rational=
    new Rational(numer+i*denom,denom)

  def * (that : Rational):Rational =
    new Rational(
      numer * that.numer,
      denom * that.denom
    )

  def * (i :Int):Rational=
    new Rational(
      numer * i,
      denom
    )

  def / (that : Rational):Rational =
    new Rational(numer * that.denom,denom * that.denom)

  def / (i : Int) :Rational =
    new Rational(numer,denom * i)


}
object Rational extends App {
//  val  y = new Rational(66,42)
//  println(y)
  val x = new Rational(1,2)
  val y = new Rational(2,3)
  println(x + y)
  println(x * 4)
  implicit def inToRational(x :Int) = new Rational(x)
  val r = new Rational(2,3)
  println(2*r)
}