package tutorial.basic

import scala.util.control.Breaks.{break, breakable}

object Loops {
  def main(args: Array[String]): Unit = {
    whileLoop()
    forLoop()
    breakableLoop()
  }
}

def whileLoop(): Unit = {
  var a = 0;
  while (a < 10) {
    print(a)
    a += 1
  }
  println
}

def forLoop(): Unit = {
  for (a <- 1 to 10) {
    print(a);
  }

  println
  for (a <- 1 until 10) {
    print(a);
  }

  println
  var result = for (a <- 1 to 10) yield a
  for (i <- result) {
    print(i)
  }

  println
  var list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  for (i <- list) {
    print(i)
  }

  println
  list.foreach(print)

  println
  list.foreach((element: Int) => print(element))

  println
  for (i <- 1 to 10 by 2) {
    print(i)
  }
}

def breakableLoop(): Unit = {
  println
  breakable {
    for (i <- 1 to 10) {
      if (i == 7)
        break
      print(i)
    }
  }
}