package function

import scala.io.Source

object LongLines {
  def processFile(fileName :String, width:Int): Unit ={
    // 在函数内部定义函数 这样局部函数只在包含它的代码块中可见
    def processLine(line :String): Unit ={
      if (line.length > width) {
        print(fileName+": "+line.trim)
      }
    }
    val source = Source.fromFile(fileName)
    for(line <- source.getLines()){
      processLine(line)
    }
  }

}
