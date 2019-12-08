def factorial(n:Int):Int = {
  def go(n: Int, acc: Int): Int = {
    if (n <= 0) {
      acc
    } else
    // 尾调用消除
    // 编译器会优化为类似 while 循环的方式
      go(n - 1, acc * n)
  }
  go(n, 1)
}

