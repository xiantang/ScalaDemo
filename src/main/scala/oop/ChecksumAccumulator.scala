package oop
import scala.collection.mutable
// 类定义
class ChecksumAccumulator {
  // 默认是public
  var sum = 0
  // 参数的重要特征是他们都是val 而不是 var
  // b= 1 不能编译
  def add(b:Byte): Unit = sum += b
  def checksum(): Int = ~(sum & 0xFF) +1
}

// 伴生对象
// 可以互相访问对方
object ChecksumAccumulator{
  private val cache = mutable.Map.empty[String,Int]

  def calculate(s : String) : Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for(c <- s)
        acc.add(c.toByte)
      val  cs = acc.checksum()
      cache += (s -> cs)
      cs
    }

  def main(args: Array[String]): Unit = {
    ChecksumAccumulator.calculate("Every value is an object.")
  }

}