package tutorial.collection

import scala.collection.immutable.Queue

object QueueExample {
  def main(args: Array[String]): Unit = {

    var q1 = Queue(1, 5, 6, 2, 3, 9, 5, 2, 5)
    var q2: Queue[Int] = Queue(1, 5, 6, 2, 3, 9, 5, 2, 5)
    println(q1)
    println(q2)

    var queue = Queue(1, 5, 6, 2, 3, 9, 5, 2, 5)
    print("Queue Elements: ")
    queue.foreach((element: Int) => print(element + " "))
    var firstElement = queue.front
    print("\nFirst element in the queue: " + firstElement)
    var lastElement = queue.last
    print("\nLast element in the queue: " + lastElement)
    var enqueueQueue = queue.enqueue(100)
    print("\nElement added in the queue: ")
    enqueueQueue.foreach((element: Int) => print(element + " "))
    var dequeueQueue = queue.dequeue
    print("\nElement deleted from this queue: " + dequeueQueue)
  }
}
