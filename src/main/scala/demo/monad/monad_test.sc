import scala.concurrent.Future

val f = (i: Int) => List(i - 1, i, i + 1)

val list = List(5, 6, 7)

//          map with A => M[B]                  flatten
// M[A]  ------------------------->  M[M[B]]  -----------> M[B]
println(list.flatMap(f))


val g = (i: Int) => List("pred=" + (i - 1), "succ=" + (i + 1))

val list2 = List(5, 6, 7)
println(list2.flatMap(g))
// prints List(pred=4, succ=6, pred=5, succ=7, pred=6, succ=8)

// This means that a simple apply() serves as a perfectly good unit.

trait User {
  val child: Option[User]
}

class  AUser (chil2:User) extends User{
  override val child = Some(chil2)
}

object UserService {
  def loadUser(name: String): Option[User] = {
    Some(new AUser(new AUser(new AUser(null))))
  }
}
val getChild = (user: User) => user.child

val result = UserService.loadUser("mike")
  .flatMap(user => user.child)
  .flatMap(user => user.child)


val result = for{
  user <- UserService.loadUser("mike")
  userChild <- user.child
  usersGrandChild <- userChild.child
} yield usersGrandChild



trait Order
trait Item
trait PurchaseResult
trait LogResult
import scala.concurrent.ExecutionContext.Implicits.global

object OrderService {
  def loadOrder(username: String): Future[Order] ={
    Future { new Order {}}
  }
}
object ItemService {
  def loadItem(order: Order): Future[Item] = {
    Future { new Item {} }
  }
}
object PurchasingService {
  def purchaseItem(item: Item): Future[PurchaseResult] = {
    Future { new PurchaseResult {} }
  }
  def logPurchase(purchaseResult: PurchaseResult): Future[LogResult] = {
    Future { new LogResult {} }
  }
}
val loadItem: Order => Future[Item] = {
  order => ItemService.loadItem(order)
}
val purchaseItem: Item => Future[PurchaseResult] = {
  item => PurchasingService.purchaseItem(item)
}

val logPurchase: PurchaseResult => Future[LogResult] = {
  purchaseResult => PurchasingService.logPurchase(purchaseResult)
}

val result =
  OrderService.loadOrder("name")
  .flatMap(loadItem).flatMap(purchaseItem).flatMap(logPurchase)

for{
  loadedOrder <- OrderService.loadOrder("name")
  loadedItem <- ItemService.loadItem(loadedOrder)
  purchaseResult <- PurchasingService.purchaseItem(loadedItem)
  logResult <- PurchasingService.logPurchase(purchaseResult)
}yield logResult
