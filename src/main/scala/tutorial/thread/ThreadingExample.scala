package tutorial.thread

object ThreadingExample {
  def main(args: Array[String]): Unit = {
    var t1 = new Thread1()
    var t2 = new Thread2()
    var t3 = new Thread3()


    t1.setName("First Thread")
    t3.setName("Third Thread")
    t1.setPriority(Thread.MIN_PRIORITY)
    t3.setPriority(Thread.MAX_PRIORITY)

    t1.run()
    t2.run()
    t3.run()

    t1.join()
    t3.join()

  }
}

class Thread1 extends Thread {
  override def run(): Unit = {
    println("Thread is started... for thread1");
    Thread.sleep(1000)
    println("Thread is stopped... for thread1");
  }

  def task(): Unit = {
    for (i <- 0 to 5) {
      println(i)
      Thread.sleep(200)
    }
  }
}

class Thread2 extends Runnable {
  override def run(): Unit = {
    println("Thread is started... for thread2");
    Thread.sleep(1000)
    println("Thread is stopped... for thread2");
  }
}

class Thread3 extends Thread {
  override def run(): Unit = {
    println("Thread is starting... for thread3");
    for (i <- 0 to 5) {
      print(i + " ")
      Thread.sleep(500)
    }
    println("Thread is stopped... for thread3");
  }
}