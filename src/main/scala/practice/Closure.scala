package practice

object Closure {

  val p=10

  def main(args: Array[String]): Unit = {
  println(doIncrement(100))
  }

  def doIncrement(salary:Double) = salary + salary * p/100
}
