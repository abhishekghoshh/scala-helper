package tutorial.basic

import scala.annotation.tailrec


object Functions {
  def main(args: Array[String]): Unit = {
    welcome()
    welcome("Abhishek Ghosh")
    println(random())
    println(fibonacci(10))
    namedParameter(10, 20)
    namedParameter(num2 = 20, num1 = 10)
    namedParameter(num1 = 10, num2 = 20)
    higherOrderFunction("Abhishek", welcome)
    anonymousMethod()
    multipleParameters()
    println(addAll(1, 2, 3, 4, 5, 6, 7, 8, 9))


    // tail recursion with example


    // call by value vs call by name
    callByValue(System.nanoTime())
    callByName(System.nanoTime())
  }
}

def anonymousMethod(): Unit = {
  val result1 = (a: Int, b: Int) => a + b
  println(result1(10, 15))

  val result2 = (_: Int) + (_: Int)
  println(result2(10, 10))
}
def add(num1: Int, num2: Int): Int = {
  num1 +
    num2
}
def addIt(a: Int)(b: Int) = {
  a + b
}
def random(): Int = {
  10
}


def welcome(name: String = "Human"): Unit = {
  println(s"Hi $name, Welcome to our society")
}

def namedParameter(num1: Int, num2: Int): Unit = {
  println(s"num1 is $num1 and num2 is $num2")
}

def higherOrderFunction(name: String, func: String => Unit): Unit = {
  func(name)
}

def multipleParameters(): Unit = {
  println("multiple parameters")
  val sum1 = addIt(10)(10)
  val sum2 = addIt(2) _
  val sum3 = addIt(23)
  println(sum1)
  println(sum2)
  println(sum3)
}

def addAll(nums: Int*): Int = {
  var sum = 0
  for (num <- nums) sum += num
  sum
}

def fibonacci(num: Int): Int =
  if (num <= 1) 1
  else fibonacci(num - 1) + fibonacci(num - 2)

def factorial(num: Int): Int =
  if (num <= 1) 1
  else num * factorial(num - 1)


def callByValue(time: Long): Unit = {
  println("Call by value")
  println(time)
  println(time)
  println(time)
}

// delays the expression evaluation
// so time is calculated only where it is needed
// it is a lazy approach
// => value is not passed the whole expression is passed
def callByName(time: => Long): Unit = {
  println("Call by name")
  println(time)
  println(time)
  println(time)
}