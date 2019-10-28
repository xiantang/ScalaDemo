// 1 - the imports


import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Random, Success}


object TimedEvent extends App{


  def sleep(value: Long) {Thread.sleep(value)}
//
//  // used by time method
//  implicit val baseTime = System.currentTimeMillis()
//
//  implicit val enabled = scala.language.postfixOps
//  // create a future
//  val f = Future{
//    sleep(500)
//    1+1
//  }
//
//  val result = Await.result(f,1 second)
//  println(result)
//  sleep(1000)
  println("starting calculation")
  val f = Future{
    sleep(Random.nextInt(500))
    42
  }
  println("before onComplete")
  f.onComplete {
    case Success(value) => println(s"Got the callback, meaning = $value")
    case Failure(e) => e.printStackTrace()
  }

  // do the rest of your work
  println("A ..."); sleep(100)
  println("B ..."); sleep(100)
  println("C ..."); sleep(100)
  println("D ..."); sleep(100)
  println("E ..."); sleep(100)
  println("F ..."); sleep(100)
  sleep(2000)

}
