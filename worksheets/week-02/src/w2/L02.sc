object L2P2 {
  def product(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b)
      1
    else
      f(a) * product(f)(a + 1, b)
  }

  def factorial(x: Int): Int = {
    product(x => x)(1, x)
  }
}
// Test
println(L2P2.product(x => x * x)(3, 4))
println(L2P2.factorial(4))
