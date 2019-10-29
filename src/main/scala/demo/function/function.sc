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
  def isGoodEnough(guess:Double) :Boolean =
    abs(guess * guess - x) <0.000001

  def improve(guess:Double) :Double =
    (x / guess + guess)/2
  def sqrtIter(guess:Double) :Double = {
    if (isGoodEnough(guess) ){
      guess
    } else {
      sqrtIter(improve(guess))
    }
  }
  sqrtIter(1.0)
}






val a = sqrt(2)

sqrt(4)

// map
//在列表中的每个元素上计算一个函数，并且返回一个包含相同数目元素的列表。
val numbers = Array(1,2,3,4)
numbers.map(_ *2)

numbers
// foreach
// 和 map 一样但是没有返回值
numbers.foreach(println(_))


// filter
// 移除任何使得传入的函数返回false的元素。返回Boolean类型的函数一般都称为断言函数。
numbers.filter(_ %2 ==0 )

// zip
// 把两个列表合成由一个元素组成的列表中
Array(1,2,3).zip(Array("one","two","three"))

// partition
// 根据断言函数的返回值对列表进行拆分
numbers.partition(_ % 2 == 0)

// find
// 返回第一个匹配断言的
numbers.find(_ > 5)


// drop

val number2 = numbers.drop(1)

//val number3 = numbers.dropWhile(_ % 2 != 0)


// foldLeft
numbers.foldLeft(0){
  (a,b) => println("a: " + a + " b: " + b);a+b
}


// flatten
// flatten可以把嵌套的结构展开
Array(Array(1,2),Array(3,4)).flatten

// flatMap
val test = Array(Array(1, 2), Array(3, 4))
test.flatMap(x =>{
  x.map(_*2)
}
)

