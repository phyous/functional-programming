object L2P1 {
  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, b: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, b, acc + f(a))
    }
    loop(a, b, 0)
  }

  def id(x: Int): Int = x
  def cube(x: Int): Int = x * x * x
  def fact(x: Int): Int = if (x == 0) 1 else fact(x - 1)
}
// Test
println(L2P1.sum(L2P1.cube)(1, 3))