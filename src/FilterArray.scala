object FilterArray extends App {
  def f(delim: Int, arr: List[Int]): List[Int] = {
    //    arr.filter(_.<(delim))
    def pred(n: Int): Boolean = {
      if (n < delim) true;
      else false;
    }
    arr.filter(pred)
  }

  val input = io.Source.stdin.getLines.toList
  println(
    f(input.head.toInt, input.map(_.trim).map(_.toInt))
      .map(_.toString)
      .mkString("\n")
  )
}
