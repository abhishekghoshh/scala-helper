package tutorial.collection

import scala.collection.immutable.{HashMap, ListMap}

object MapExample {
  def main(args: Array[String]): Unit = {

    var mp1 = Map(("A", "Apple"), ("B", "Ball"))
    var mp2 = Map("A" -> "Apple", "B" -> "Ball")
    var mtMap: Map[String, String] = Map.empty[String, String]
    println(mp1)
    println(mp2)
    println("Empty Map: " + mtMap)
    println(mp1("A")) // Accessing value by using key
    var newMap = mp1 + ("C" -> "Cat") // Adding a new element to map
    println(newMap)
    var removeElement = newMap - ("B") // Removing an element from map
    println(removeElement)


    var hm1 = new HashMap()
    var hm2 = HashMap("A" -> "Apple", "B" -> "Ball", "C" -> "Cat")
    println(hm1)
    println(hm2)
    var hashMap = HashMap("A" -> "Apple", "B" -> "Ball", "C" -> "Cat")
    hashMap.foreach {
      case (key, value) => println(key + " -> " + value) // Iterating elements
    }
    println(hashMap("B")) // Accessing value by using key
    var newHashMap = hashMap + ("D" -> "Doll")
    newHashMap.foreach {
      case (key, value) => println(key + " -> " + value)
    }


    var lm1 = ListMap("Rice" -> "100", "Wheat" -> "50", "Gram" -> "500") // Creating listmap with elements
    var lm2 = new ListMap() // Creating an empty list map
    var lm3 = ListMap.empty // Creating an empty list map
    println(lm1)
    println(lm2)
    println(lm3)
    var listMap = ListMap("Rice" -> "100", "Wheat" -> "50", "Gram" -> "500") // Creating listmap with elements
    listMap.foreach {
      case (key, value) => println(key + "->" + value)
    }
    println(listMap("Gram"))
    var newListMap = listMap + ("Pulses" -> "550")
    newListMap.foreach {
      case (key, value) => println(key + " -> " + value)
    }
  }
}
