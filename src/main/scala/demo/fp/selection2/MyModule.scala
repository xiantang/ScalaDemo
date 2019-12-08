package demo.fp.selection2

object MyModule {


  def abs(n:Int):Int= {
    if (n < 0) -n
    else n
  }

  private def formatAbs(x:Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  // 通常返回 Unit 的方法暗示它包含副作用 
  def main(args: Array[String]): Unit = {
    println(formatAbs(-42))
  }
}
