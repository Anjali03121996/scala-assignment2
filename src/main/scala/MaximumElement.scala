//import scala.io.StdIn.readLine
class MaximumElement {
  def max(mainList: List[Int]): Int = {
      val max1 = maxRecursive(mainList.tail,mainList.head)
      max1

  }

  def maxRecursive(mainList: List[Int], maximum: Int): Int = {
    if (!mainList.isEmpty ){
      if (mainList.head > maximum) maxRecursive(mainList.tail, mainList.head)
      else maxRecursive(mainList.tail, maximum)
    }else {
      maximum
    }
  }

}
object MaximumElement{
  def main(args: Array[String]): Unit = {
    val mainList = List(1,5,2,9,7)
    val maxObj = new MaximumElement
    println(maxObj.max(mainList))


   // def max(givenList : List[Int]): Int ={


    }
  //}
}
