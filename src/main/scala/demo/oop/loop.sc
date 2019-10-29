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
  for (
    file ← fileHere
    if file.getName.endsWith(".py");
    line <- fileLines(file)
    if line.trim.matches(patterm)
  )println(file + ":" + line.trim)

grep(".*?")