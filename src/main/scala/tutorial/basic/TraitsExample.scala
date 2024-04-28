package tutorial.basic

object TraitsExample {
  def main(args: Array[String]): Unit = {

  }
}

trait Printable {
  def print(): Unit

  def show(): Unit = { // Non-abstract method
    println("This is show method")
  }
}

trait Showable {
  def show(): Unit
}

abstract class PrintA4{
  def printA4():Unit
}

class A6 extends PrintA4 with Printable with Showable {
  def print(): Unit = {
    println("This is printable")
  }

  override def show(): Unit = {
    println("This is showable");
  }

  override def printA4(): Unit = {
    println("This is printA4");
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    var paper = new A6()
    paper.print()
    paper.show()
    paper.printA4()
  }
}