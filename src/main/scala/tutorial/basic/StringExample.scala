package tutorial.basic

object StringExample {
  def main(args: Array[String]): Unit = {
    comparingString()
  }
}

def comparingString(): Unit = {
  var s0 = new String("Hello Scala")
  var s1 = "Hello Scala people"
  var s2 = "Hello Scala"
  var s3 = "Hello Scala"

  println(s1==s2)
  println(s3==s2)
  println(s0==s2)

  println(s1.compareTo(s2))
  println(s2.compareTo(s3))
  println(s0.compareTo(s2))


}