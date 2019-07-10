class Fibonacci {
  def fibo(i : Int) : Int ={
    if(i== 0 || i == 1) i
    else {
      (fibo(i-1) + fibo(i-2))
    }
  }
}
object Fibonacci{
  def main(args: Array[String]): Unit = {
    val n = 4

    val result = new Fibonacci
    for(i <- 0 to n) {
      result.fibo(i)
      if(i==n)
        {
          println(result.fibo(i))
        }
    }


  }
}