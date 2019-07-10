/*class StringInterpolation {
  val mainList : List[Int]= List(10,20,30,40)
  mainList.foreach(println(s"i = $mainList"))
}*/
object StringInterpolation{
  def main(args: Array[String]): Unit = {
    val mainList = List(10,20,30,40)
    for(i <- mainList) println(s"${mainList.indexOf(i)} = $i")
  }
}
