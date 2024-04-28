package tutorial.basic

object Variables {
  def main(args: Array[String]): Unit = {
    var data: Int = 100
    val data2: Int = 100
    // data2=80 //it will give compilation error
    // data2 is initialized with val not var so bit is immutable

    var name = "Abhishek Ghosh"
    println(name)

    val probability = {
      math.random() >= .5
    }
    println(probability)
  }
}
