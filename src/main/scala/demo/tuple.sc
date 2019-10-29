var pair = (99,"Luftballons","a")
println(pair._1)
println(pair._2)

// 调用的是伴生对象的 apply 方法
// 不可变
var jetSet = Set("Beoing","Airbus")
println(jetSet.hashCode())
jetSet += "Lear"
println(jetSet.hashCode())
println(jetSet.contains("Cesssna"))

import scala.collection.mutable


val  movieSet = mutable.Set("Beoin","Airbus")
println(movieSet.hashCode())
movieSet  += "Lea"
println(movieSet.hashCode())


val treasureMap = mutable.Map[Int,String]()
treasureMap += (1-> "Go to island")
treasureMap += (2-> "Find big X on ground")
treasureMap += (3-> "Dig.")
println(treasureMap(2))

val romanNumeral= Map(
  1 -> "I", 2 -> "II", 3 ->"III", 4 -> "IV",5->"V"
)
println(romanNumeral(4))

// 使用var 是指令式风格的
def printArgs(args: Array[String]): Unit = {
  var i = 0;
  while (i < args.length) {
    println(args(i))
    i+=1
  }
}

def printArgs(args : Array[String]): Unit ={
  for(arg <- args) {
    println(arg)
  }
}

def printArgs(args : Array[String]): Unit ={
  args.foreach(println)
}

def formatArgs(args : Array[String]) = args.mkString("\n")

println(formatArgs(Array("a","B","c")))

val res = formatArgs(Array("zero","one","two"))
assert(res =="zero\none\ntwo")

import scala.io.Source

