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


var  numName2 = Array.apply("zero","one","two")

val oneTwoThree = List(1, 2, 3)


val oneTwo = List(1, 2)
val threeFour = List(3, 4)
// 列表类定义了 ':::' 方法实现叠加功能
val oneTwoThreeFour = oneTwo ::: threeFour
println(" " + oneTwo + " and " + threeFour + " were not mutated")
println("Thus, " + oneTwoThreeFour + " is a new List")


// :: cons  把新元素组合到现有列表最前端

val twoThree = List(2,3)
// 操作数如果以：结尾可以改写成 twoThree.::(1)
val oneTwoThree1 = 1 :: twoThree
println(oneTwoThree1)

var thrill = "Will" :: "fill" :: "until" :: Nil

thrill(2)

thrill.count(s => s.length == 4)

thrill.drop(2)


//thrill = "fill" :: "until" :: Nil

thrill.exists(s => s == "until")

thrill.filter(s => s.length == 4)

thrill.forall(s => s.endsWith("1"))

thrill.foreach(s => print(s))

thrill.head

//thrill.mkString(", ")

thrill.reverse


