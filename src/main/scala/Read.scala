import scala.io.Source

object Read {

  def main(args: Array[String]): Unit = {
    val lines = Source.fromFile(args(0)).getLines().toList
    def widthOfLength(s: String) = s.length
    val longestLine = lines.reduceLeft((a,b) =>if (a.length>b.length) a else b)
    val maxWidth = widthOfLength(longestLine)
    for (line <- lines) {
      val numSpaces = maxWidth - widthOfLength(line)
      val padding = " " + numSpaces
      println(padding + line.length + " | "+line)
    }

  }
}
