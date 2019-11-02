def sum(f: Int => Int)(a :Int,b:Int):Int=
  if (a >b)0 else f(a) + sum(f)(a+1,b)


sum(x =>2)(1,20)


object exercise{
  def product(f:Int => Int)(a:Int,b:Int):Int =
    if (a>b) 1
    else f(a) * product(f)(a + 1, b)

  def fact(n : Int) = product(x=>x)(1,n)
}

// 9 * 16
exercise.product(x => x*x)(3,4)
// 阶乘 1*2*3
exercise.fact(3)