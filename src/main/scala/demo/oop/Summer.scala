package oop

import ChecksumAccumulator.calculate


object Summer {
  def main(args: Array[String]): Unit = {
//    for (arg <- args) {
//      println(arg + ": "+calculate(arg))
//    }
    val fileName = if (!args.isEmpty) args(0)
    else "default.text"
    println(fileName)

    def gcdLoop(x:Long,y :Long):Long = {
      var a = x
      var b = y
      while (a != 0 ){
        val temp = a
        a = b%a
        b = temp
      }
      b
    }

    def gcd(x:Long,y:Long):Long =
      if (y == 0) x else gcd(y,x%y)

  }
}
