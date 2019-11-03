class Rational(x:Int,y:Int){
  def numer = x
  def denom = y

  def +(s:Rational):Rational =
    new Rational(
      numer * s.denom + s.numer*denom,
      denom*s.denom
    )

  def neg(): Rational ={
    new Rational(-numer,denom)
  }

  def -(s:Rational):Rational =


  override def toString() = numer +"/"+denom



}




val rational = new Rational(1,2)

rational + new Rational(2,3)

rational.neg

val x = new Rational(1,3)
val y = new Rational(5,7)
val z = new Rational(3,2)
