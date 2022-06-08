object ListReplication extends App {
  def f(num:Int,arr:List[Int]):List[Int] = {
    arr.flatMap(e => List.fill(num)(e))
  }

  def displayResult(arr:List[Int]): Unit = println(f(arr.head,arr.drop(1)).map(_.toString).mkString("\n"))

  displayResult(io.Source.stdin.getLines.toList.map(_.trim).map(_.toInt))
}