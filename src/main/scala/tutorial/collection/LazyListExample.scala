package tutorial.collection

object LazyListExample {
  def main(args: Array[String]): Unit = {
    var lazyList = 100 #:: 200 #:: 85 #:: LazyList.empty
    println(lazyList)
    lazyList.foreach((num: Int) => print(num + " "))
    println

    lazyList = 100 #:: 200 #:: 85 #:: LazyList.empty
    println(lazyList)
    var lazyList2 = (1 to 10).to(LazyList)
    println(lazyList2)
    var firstElement = lazyList2.head
    println(firstElement)
    println(lazyList2.take(10))
    println(lazyList.map {
      _ * 2
    })
  }
}
