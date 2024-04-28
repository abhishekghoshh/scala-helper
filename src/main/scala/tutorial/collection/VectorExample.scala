package tutorial.collection

object VectorExample {
  def main(args: Array[String]): Unit = {
    var vc1: Vector[Int] = Vector(5, 8, 3, 6, 9, 4) //Or
    var vc2 = Vector(5, 2, 6, 3)
    var vc3 = Vector.empty
    println(vc1)
    println(vc2)
    println(vc3)


    var vector = Vector("Hockey", "Cricket", "Golf")
    var vector2 = Vector("Swimming")
    print("Vector Elements: ")
    vector.foreach((element: String) => print(element + " "))
    var newVector = vector :+ "Racing" // Adding a new element into vector
    print("\nVector Elements after adding: ")
    newVector.foreach((element: String) => print(element + " "))
    var mergeTwoVector = newVector ++ vector2 // Merging two vector
    print("\nVector Elements after merging: ")
    mergeTwoVector.foreach((element: String) => print(element + " "))
    var reverse = mergeTwoVector.reverse // Reversing vector elements
    print("\nVector Elements after reversing: ")
    reverse.foreach((element: String) => print(element + " "))
    var sortedVector = mergeTwoVector.sorted // Sorting vector elements
    print("\nVector Elements after sorting: ")
    sortedVector.foreach((element: String) => print(element + " "))
  }
}
