import java.math.BigInteger

val big = new BigInteger("12345")


val greetStrings = new Array[String](3)

greetStrings(0) = "Hello"
greetStrings(1) = "."
greetStrings(2) = "world!\n"

//for(i<- 0 to 2){
//  println(greetStrings(i))
//}

greetStrings.foreach(arg => println(arg))

Console println 10
greetStrings.update(0,"Hello")



val numNames = Array("zero","one","two")