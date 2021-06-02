package practice

object PatternMatching {



  def myTest(x: Any) = {
    x match {
      case i: Integer => "It is an integer " + i
      case s: String => "It is String " + s
      case d: Double => "It's a double " + d
      case _ => "Oops! Something Else"
    }
  }

  //Calling
  def main(args: Array[String]): Unit = {
    println(myTest(1))
    println(myTest("Anshul"))
    println(myTest(1.11))
  }

}
