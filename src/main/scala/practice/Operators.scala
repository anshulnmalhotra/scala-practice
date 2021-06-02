package practice

object Operators {

  def main(args: Array[String]): Unit = {

    val i =1

    val a = i.to(10)
    println(a)

    val b = i to 10
    println(b)

    val c = i.to(20,2)
    println(c)

    val d = i to (20,2)
    println(d)

    //Unary Operator as operator and method also
    println(-i * 2)

    println(i.unary_- *2)
  }


}
