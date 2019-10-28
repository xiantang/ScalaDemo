import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Random

object OnSuccessAndFailure extends App{
  def sleep(time: Long) { Thread.sleep(time) }
  val f = Future{
    sleep(Random.nextInt(500))
    if (Random.nextInt(500) > 250) throw new Exception("Yikes")
  }


}
