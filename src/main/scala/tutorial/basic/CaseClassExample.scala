package tutorial.basic

object CaseClassExample {
  def main(args: Array[String]): Unit = {
    callCase(new CaseClass1(1,2))
    callCase(new CaseClass2(2))
    callCase(CaseObject)
  }
}

trait SuperTrait

case class CaseClass1(a: Int, b: Int) extends SuperTrait

case class CaseClass2(a: Int) extends SuperTrait

case object CaseObject extends SuperTrait

def callCase(f: SuperTrait): Unit = f match {
  case CaseClass1(f, g) => println("a = " + f + " b =" + g)
  case CaseClass2(f) => println("a = " + f)
  case CaseObject => println("No Argument")
}