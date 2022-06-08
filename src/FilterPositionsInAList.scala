object FilterPositionsInAList extends App{
  def f(arr:List[Int]): List[Int] = {
    arr.zipWithIndex.filter(e => e._2 % 2 != 0).map(_._1)
  }

  println(f(io.Source.stdin.getLines.map(_.trim).map(_.toInt).toList))
}
