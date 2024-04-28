package tutorial.basic

import scala.annotation.targetName

object ClassExample {
  def main(args: Array[String]): Unit = {
    val st1 = new Student(100, "Abhishek Ghosh")
    println(st1.getName)
    st1.printName()
    println(st1.name)
    st1.changeFullName("Budhdhadeb Ghosh")
    println(st1.printFullName())
    Student.maleOrFemale = 'M'
    println(Student.maleOrFemale)
    println(new Student(1, "Abhishek", 25))

    println(add(2, 3))
    println(add(2.00, 3.00))

    st1.talk()
    st1.call()
    st1.isAStudent()
    st1.show()


    var h1 = new HumanBeing:
      override def await(): Unit = println("I am awaiting")
    h1.await()


    var counter = new Counter(10)
    var counter2 = counter inc 10
    var counter3 = counter.inc(10)
    println(raw"counter2.count == counter3.count : ${counter2.count == counter3.count}")

    var counter4 = counter2 + counter3
    println(s"counter4 value is ${counter4.count}")

    var counter5 = counter4()
    println(s"counter5 value is ${counter5.count}")

    var counter6 = counter4(12)
    println(s"counter6 value is ${counter6.count}")

    var counter7 = Counter(10)
    println(s"counter7 value is ${counter7.count}")

  }
}

class Student(id: Int, var name: String) extends Person {
  private var fullName = "Abhishek Ghosh"
  override val isStudent = true

  def printName(): Unit = {
    println(s"Your name is $name")
  }

  def getName: String = name

  def changeFullName(fullName: String): Unit = {
    this.fullName = fullName
  }

  def printFullName(): String = this.fullName

  def showDetails(): Unit = {
    println(id + " " + name);
  }

  private var age: Int = 0

  def this(id: Int, name: String, age: Int) = {
    this(id, name)
    this.age = age
  }

  override def call(): Unit = {
    super.call()
    println("I am a student and I am calling")
  }
}

object Student {
  var maleOrFemale: Char = 'U'
}

class Person extends HumanBeing {
  val isStudent = false

  def isAStudent(): Unit = {
    println(isStudent)
  }

  def talk(): Unit = {
    println("I am a person and I am talking")
  }

  def call(): Unit = {
    println("I am a person and I am calling")
  }

  private final val speed: Int = 60

  final def show(): Unit = {
    println(f"person is running at $speed")
  }

  override def await(): Unit = {
    println("I am awaiting")
  }
}

abstract class HumanBeing {
  def alive(): Unit = {
    println("I am a human Being")
  }

  def await(): Unit
}

def add(num1: Int, num2: Int): Int = {
  num1 + num2
}
def add(num1: Double, num2: Double): Double = {
  num1 + num2
}

class Counter(n: Int) {
  def count: Int = n

  def inc(): Counter = new Counter(this.n + 1)

  def inc(n: Int): Counter = new Counter(this.n + n)

  def dec(): Counter = new Counter(this.n - 1)

  def dec(n: Int): Counter = new Counter(this.n - n)


  @targetName("counter")
  def +(counter: Counter): Counter = new Counter(counter.count + this.n)

  def apply(): Counter = new Counter(this.n)

  def apply(n: Int): Counter = new Counter(this.n + n)

  @targetName("counter")
  def unary_-(): Counter = {
    new Counter(-this.n)
  }
}

object Counter {
  def apply(n: Int): Counter = new Counter(n)
}