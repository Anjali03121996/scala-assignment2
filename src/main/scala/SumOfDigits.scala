class SumOfDigits {

  def product(n : Int) : Int = {
    if(n>=1) {
      n*product(n-1)
    }
    else 1
  }
  def sumOfProduct(prod : Int) : Int ={
    if(prod<=9) prod
    else {
      val remainder = prod % 10
      val division = prod / 10
      remainder + sumOfProduct(division)
    }
  }
}
object SumOfDigits{
  def main(args: Array[String]): Unit = {
    val n =5
    val product = new SumOfDigits
    val prod = product.product(n)
    val sum = product.sumOfProduct(prod)
    println(" The product is : " + prod , " The sum of the product is : " + sum +" ")
  }
}
