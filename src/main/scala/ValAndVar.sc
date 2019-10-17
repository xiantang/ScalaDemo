var greeting  = "Hello World"


var capital = Map("US" -> "Washington", "France" -> "Paris")


capital += ("Japan"->"Tokyo")

println(capital("France"))

def factorial(x:BigInt):BigInt =
  if (x == 0) 1 else x * factorial(x-1)

factorial(30)

import java.math.BigInteger

import javax.xml.crypto.Data

import scala.collection.mutable

def factoral(x:BigInteger):BigInteger =
  if (x == BigInteger.ZERO)
    BigInteger.ONE
  else
    x.multiply(factoral(x.subtract(BigInteger.ONE)))

factoral(BigInteger.valueOf(30))

var string = "123";
string.toInt;

// index
class  MyClass(index:Int,name:String)

val namHashUpperCase = "teSt".exists(_.isUpper)


val x = new mutable.HashMap[Int,String]()


val msg3: String = "Hello world"


def max(x:Int , y:Int):Int = {
  if (x>y)x
  else y
}

max(3,5)

def greet() = println("Hello,world")

greet()