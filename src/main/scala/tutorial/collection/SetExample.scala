package tutorial.collection

import scala.collection.immutable.{HashSet, ListSet}
import scala.collection.{BitSet, SortedSet}

object SetExample {
  def main(args: Array[String]): Unit = {
    var games = Set("Cricket", "Football", "Hockey", "Golf")
    var alphabet = Set("A", "B", "C", "D", "E")

    var mergeSet = games ++ alphabet // merging two set
    println(mergeSet)

    println
    var setDifference = games -- alphabet
    println(setDifference)

    games = games - "Cricket" + "Volley"
    println(games)

    println
    for (game <- games) print(game + " ")

    println
    games.foreach((game: String) => print(game + " "))

    println
    var setIntersection = games.intersect(alphabet)
    println("Intersection by using intersect method: " + setIntersection)
    println("Intersection by using & operator: " + (games & alphabet))
    var setUnion = games.union(alphabet)
    println(setUnion)


    println
    var hashset = HashSet(4, 2, 8, 0, 6, 3, 45)
    hashset.foreach((element: Int) => print(element + " "))

    println
    var sortedSet: SortedSet[Int] = SortedSet(5, 8, 1, 2, 9, 6, 4, 7, 2)
    sortedSet.foreach((element: Int) => print(element + ","))

    println
    var bitset = BitSet(1, 5, 8, 6, 9, 0, 30000)
    bitset.foreach((element: Int) => print(element + " "))
    bitset += 34
    bitset.foreach((element: Int) => print(element + " "))
    bitset -= 34
    bitset.foreach((element: Int) => print(element + " "))


    println
    val listSet = ListSet(4, 2, 8, 0, 6, 3, 45)
    listSet.foreach((element: Int) => print(element + " "))

    println
    var listSet1: ListSet[String] = new ListSet()
    var listSet2: ListSet[String] = ListSet.empty
    println("listSet1: " + listSet1)
    println("listSet2: " + listSet2)
    println("After adding new elements:")
    listSet1 += "India"
    listSet2 += "Russia"
    println("listSet1: " + listSet1)
    println("listSet2: " + listSet2)
  }
}
