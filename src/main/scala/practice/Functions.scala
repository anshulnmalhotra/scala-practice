package practice

object Functions {


  def main(args: Array[String]): Unit = {
    //Calling Annonumous Function
    println(myfun(5,"-"))

    val x=f1
    f2(f1)

    println(doubler(2))
    println(doublerAnonymous(5))
    println(rFactorial(5))
    println(tFactorial(5,1))

    val feboStream = fibFrom(1,2)
    feboStream.takeWhile(_<=10) foreach println

  }




  val myfun= (num:Int, word:String) => word + num + word

  def f1 = println("Example of first class function")

  def f2(func:Unit) = func

  def doubler(number:Int):Int = {return 2*number}

  val doublerAnonymous= (number:Int) => {2* number} : Int

  def rFactorial(num:Int) : Int = {
    if (num<=0)
      return 1
    else
      return num * rFactorial(num-1)
  }

  def tFactorial(num:Int, factorial:Int) : Int = {
    if (num<=0)
      return factorial
    else
      return tFactorial(num-1, num*factorial)
  }

  //Imparitive Approach
  def imparitiveResult(marks:Int)={
    var result= ""
    if (marks>=50)
      result="passed"
    else
      result="failed"
    println(result)
  }

  //functional Approach
  def functionalResult(marks:Int) ={
    if (marks>=50) "passed"
    else "failed"
  }


  def fibFrom(a:Int, b:Int): Stream[Int]= {
   a #:: fibFrom(b,a+b)
  }

}
