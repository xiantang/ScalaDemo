var increase = (x :Int) => x+1

increase(1)

var more = 1

val addMore = (x :Int) => x+more

addMore(10)
def makeincreaser(more: Int) = (x: Int) => x + more
val inc9999 = makeincreaser(999)
inc9999(10)


def func(): Int = {
  println("Compute some stuff")
  23
}


def callByValue(x:Int)={
  println(s"1 first : $x ")
  println(s"2 second : $x ")
}

def callByName(x: => Int)={
  println(s"1 first : $x ")
  println(s"2 second : $x ")
}

callByName(func())
println("---------------------------------")
callByValue(func())


def constOne(x : Int,y: => Int) =1

def loop() = {
  println("call ")
  2
};


constOne(1+2,loop())
constOne(loop(),1+2)


// avoid "name space pollution"

def sqrt(x: Double): Double ={
  def abs(x :Double ) = if (x<0) -x else x
  def isGoodEnough(guess:Double,x:Double) :Boolean =
    abs(guess * guess - x) <0.000001

  def improve(guess:Double,x:Double) :Double =
    (x / guess + guess)/2
  def sqrtIter(guess:Double,x:Double) :Double = {
    if (isGoodEnough(guess,x) ){
      guess
    } else {
      sqrtIter(improve(guess,x),x)
    }
  }
  sqrtIter(1.0,x)
}






val a = sqrt(2)

sqrt(4)