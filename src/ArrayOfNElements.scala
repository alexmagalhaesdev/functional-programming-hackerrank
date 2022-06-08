

object ArrayOfNElements extends App{
  def f(num: Int): List[Int] = {
    val result = for (i <- 0 until num) yield i
    result.toList
  }

  println(f(scala.io.StdIn.readInt))
}
