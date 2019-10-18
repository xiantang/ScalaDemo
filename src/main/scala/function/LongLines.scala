package function

import scala.io.Source

object LongLines {

  def processLine(fileName: String, width: Int, line: String) = {
    if (line.length > width){
      println(fileName + ": "+ line.trim)
    }


  }

  def processFile(fileName :String, width:Int): Unit ={
    val source = Source.fromFile(fileName)
    for(line <- source.getLines()){
      processLine(fileName,width,line)
    }
  }

}
