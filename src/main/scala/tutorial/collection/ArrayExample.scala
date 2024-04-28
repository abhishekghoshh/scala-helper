package tutorial.collection

object ArrayExample {
  def main(args: Array[String]): Unit = {
    arrayExample()
    arrayLoop()
    new ArrayExample()
    multiDimensional()
  }
}

def arrayExample(): Unit = {
  var arr1: Array[Int] = new Array[Int](10)
  var arr2 = new Array[Int](10)
  var arr3: Array[Int] = new Array(10)
  var arr4 = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)

  println("Third Element before assignment = " + arr4(2))
  arr4(2) = 10
  println("Third Element after assignment = " + arr4(2))
}

def arrayLoop(): Unit = {
  println()
  var arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
  for (a <- arr) {
    print(a + " ")
  }
}
def multiDimensional(): Unit = {
  println()
  var multi1 = Array.ofDim[Int](2, 2)
  var multi2 = Array(Array(1,2,3,4,5), Array(6,7,8,9,10))
  for(i<-0 to 1){
    for(j <- 0 to 4){
      print(multi2(i)(j)+" ")
    }
    println()
  }
}

class ArrayExample {
  println()
  var arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
  arr.foreach((element: Int) => print(element + " "))
}