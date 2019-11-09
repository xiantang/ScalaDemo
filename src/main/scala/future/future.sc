import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global


//
//val fut = Future{
//  Thread.sleep(10000);
//  21+21
//}
//
//// 对于一个 future 的映射会交出给另外一个 future
//val result = fut.map(x => x + 1)

//Thread.sleep(10001)
//result.value
//
//
//val fut42 = Future {
//  Thread.sleep(1000)
//  42
//}
//
//
//val fut46 = Future {
//  Thread.sleep(1000)
//  46
//}
//
//
//Thread.sleep(2000)

//val fut88 = for{
//  x <- fut46
//  y <- fut42
//}yield x+y
//
//fut88.value
//
//val res7 = for {
//  x <- Future {
//    Thread.sleep(10000); 21 + 21
//  }
//  y <- Future {
//    Thread.sleep(10000); 23 + 23
//  }
//} yield x + y
//
//Thread.sleep(20001)
//res7.value


//val eventualInt = Future.successful(21+21)
//eventualInt.value



val fut = Future{42}



val invalid = fut.filter(
  res => res<0
)
