package tutorial.basic

object ExceptionExample {
  def main(args: Array[String]): Unit = {
    action(10, 0)
    action(10, 1, 12)
    action(10, 1, 1,"1667a")
    action(10, 1, 1,"123",-15)
  }
}

def action(a: Int, b: Int, i: Int = 0, args: String = "0", age: Int = 15): Unit = {
  try {
    println(a / b)
    val arr = Array(1, 2)
    arr(i)
    toInt(args)
    validateAge(age)
  } catch {
    case e: ArithmeticException => println(e)
    case ne: NumberFormatException => println(ne)
    case ie: InvalidAgeException => println(ie)
    case ex: Exception => println(ex)
    case th: Throwable => println("found a unknown exception" + th)
  }
  finally {
    println("Finally block always executes")
  }
  println("Rest of the code is executing...")
}

@throws(classOf[NumberFormatException])
def toInt(arg: String) = arg.toInt

@throws(classOf[InvalidAgeException])
def validateAge(age: Int): Unit = {
  if (age <= 0)
    throw new InvalidAgeException("age can not be 0 or negative")
}

class InvalidAgeException(s: String) extends Exception(s) {}