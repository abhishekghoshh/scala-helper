package tutorial.basic

object HelloWorld extends App {
  println("hello world from extending App")
}

object HelloWorld2 {
  def main(args: Array[String]): Unit = {
    println("hello world from main method")
  }
}