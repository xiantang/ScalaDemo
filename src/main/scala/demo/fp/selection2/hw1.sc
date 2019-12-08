// 练习2.1 写一个递归函数 获取第n个斐波那契数 使用尾递归

def fib(n: Int): Int = {
  @scala.annotation.tailrec
  def go(cur: Int, acc: (Int, Int)): Int = {
    n match {
      case 0 => 0
      case 1 => 1
      case n => if (n != cur) {
        go(cur + 1, (acc._2, acc._1+acc._2))
      } else {
        acc._1 + acc._2
      }
    }
  }
  go(2,(0,1))
}

fib(0) == 0
fib(1) == 1
fib(2) == 1
fib(3) == 2
fib(4) == 3