object HelloWorldNTimes extends App{
  def f(n: Int): Any = if (0 < n) {
    println("Hello World")
    f(n - 1)
  }
  f(4)
}
