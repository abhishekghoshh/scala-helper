package tutorial.file

import java.io.{File, PrintWriter}
import scala.io.Source


object FileHandling {
  def main(args: Array[String]): Unit = {
    createNewFile()
    printByCharacter()
    printByLine()
  }
}

def createNewFile(): Unit = {
  val filename = "ScalaFile.txt"
  val fileObject = new File(filename) // Creating a file
  val printWriter = new PrintWriter(fileObject) // Passing reference of file to the printwriter
  printWriter.write("Hello, This is scala file\nThis is a new Line") // Writing to the file
  printWriter.close() // Closing printwriter
}
def printByCharacter(): Unit = {
  val filename = "ScalaFile.txt"
  val fileSource = Source.fromFile(filename)
  while (fileSource.hasNext) {
    println(fileSource.next)
  }
  fileSource.close()
}
def printByLine(): Unit = {
  val filename = "ScalaFile.txt"
  val fileSource = Source.fromFile(filename)
  for (line <- fileSource.getLines) {
    println(line)
  }
  fileSource.close()
}