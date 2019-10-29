package higheroderfunction

object option {
  def main(args: Array[String]): Unit = {
    val name = Map(
      "Nidhi" -> "author",
      "Geeta" -> "coder"
    )
    val x = name.get("Nidhi")
    val y = name.get("Rahul")
    println(patrn(x))
    println(patrn(y))
  }

  def patrn(z: Option[String]) = z match
  {

    // for 'Some' class the key for
    // the given value is displayed
    case Some(s) => (s)

    // for 'None' class the below string
    // is displayed
    case None => ("key not found")
  }
}
