object printargs {
  def main(args: Array[String]): Unit = {
//    def printArgs(args: Array[String]): Unit = {
//      var i = 0
//      while (i < args.length) {
//        println(args(i))
//        i += 1;
//      }
//    }
//
//    printArgs(args)
//
//    def echoargs(args: Array[String]): Unit ={
//      var i = 0
//      while (i<args.length) {
//        if (i != 0)
//          print(" ")
//        print(args(i))
//        i+=1
//      }
//      println()
//    }
//    echoargs(args)

    // 将函数作为参数传入

//    args.foreach(arg => println(arg))

    for (arg <- args) {
      println(arg)
    }


    
  }
}
