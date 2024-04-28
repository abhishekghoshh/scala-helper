package tutorial.basic

object Conditional {
  def main(args: Array[String]): Unit = {
    inWords(1)
    println(search("Hello"))
    grade(57)
    println(isPositive(87))
  }
}

def grade(number: Int): Unit = {
  if (number >= 0 && number < 50) {
    println("fail")
  } else if (number >= 50 && number < 60) {
    println("D Grade")
  } else if (number >= 60 && number < 70) {
    println("C Grade")
  } else if (number >= 70 && number < 80) {
    println("B Grade")
  } else if (number >= 80 && number < 90) {
    println("A Grade")
  } else if (number >= 90 && number <= 100) {
    println("A+ Grade")
  } else println("Invalid")
}

def inWords(num: Int): Unit = {
  num match {
    case 1 => println("One")
    case 2 => println("Two")
    case _ => println("No")
  }
}

private def search(a: Any): Any =
  a match {
    case 1 => println("One")
    case "Two" => println("Two")
    case "Hello" => println("Hello")
    case _ => println("No")
  }

def isPositive(num: Int): Boolean = if (num >= 0) true else false