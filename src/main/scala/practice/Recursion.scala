package practice

object Recursion {

  def main(args: Array[String]): Unit = {

    println(recursion(5))
    println(tailRecursion(5, 1))

  }


  def recursion(i: Int): Int = {
    if (i <= 0) {
      return 1
    } else {
      return i * recursion(i - 1)
    }
  }


  def tailRecursion(i: Int, f: Int): Int = {
    if (i <= 0) {
      return f
    } else {
      return tailRecursion(i - 1, i * f)
    }

  }

}
