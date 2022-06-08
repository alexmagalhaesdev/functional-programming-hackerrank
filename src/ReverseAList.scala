

object ReverseAList extends App{
  def f(arr:List[Int]) = {
    arr.zipWithIndex.sortWith(_._2 > _._2).map(e => e._1)
  }
  println(f(io.Source.stdin.getLines.map(_.trim).map(_.toInt).toList))
}
