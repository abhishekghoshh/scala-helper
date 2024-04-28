package tutorial.collection

object TupleExample {
  def main(args: Array[String]): Unit = {
    var tuple = (1, 5, 8, 6, 4) // Tuple of integer values
    var tuple2 = ("Apple", "Banana", "Guava") // Tuple of string values
    var tuple3 = (2.5, 8.4, 10.50) // Tuple of float values
    var tuple4 = (1, 2.5, "India") // Tuple of mix type values
    println(tuple)
    println(tuple2)
    println(tuple3)
    println(tuple4)
    var tupleValues = (1, 2.5, "India")
    println("iterating values: ")
    tupleValues.productIterator.foreach(println) // Iterating tuple values using productIterator
    println("Accessing values: ")
    println(tupleValues._1) // Fetching first value
    println(tupleValues._2) // Fetching second value

    var tpleVals = getRandom()
    tpleVals.productIterator.foreach(print)
  }
}

def getRandom(): Tuple = {
  (1, 2, "a", "b", 'a', 'b')
}