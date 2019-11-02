object example extends App{
  import java.io.File

  val fileHere = (new File(".")).listFiles

  for(
    file <- fileHere
    if file.isFile
    if file.getName.endsWith(".py")
  )println(file)

  def fileLines(file:java.io.File) =
    scala.io.Source.fromFile(file).getLines().toList


  def grep(patterm:String)=
    for {
      file ← fileHere
      if file.getName.endsWith(".sbt");
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(patterm)
    }println(file + ":" + trimmed)

  grep(".*?")

  def scanFiles =
    for{
      file <- fileHere
      if file.getName.endsWith("t")
    }yield file

  val test = scanFiles;
  for {
    file <- test
  }println(file)


}


