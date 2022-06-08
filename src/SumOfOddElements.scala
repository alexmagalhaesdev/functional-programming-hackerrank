object SumOfOddElements extends App{
  def f(arr: List[Int]) = {
    arr.zipWithIndex.filter(e => e._2 % 2 != 0).fol
  }
  println(f(List(1,2,3,4)).sum)
}
