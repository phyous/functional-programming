class Rational(x: Int, y: Int) {
  require(y > 0, "denominator must be positive")

  // Secondary constructor (using this as a function)
  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  private val g = gcd(x, y)

  val numer = x
  val denom = y

  def <(that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational) = if (this < that) that else this

  def + (that: Rational) =
    new Rational(numer * that.denom + that.numer * denom,
      denom * that.denom)

  // Postfix operator example
  def - (that: Rational) = this + -that

  // Defining a prefix operator (uses unary_*** convention)
  def unary_- = new Rational(numer * -1, denom)

  override def toString = (numer / g) + "/" + (denom / g)
}
val x = new Rational(1, 3)
val y = new Rational(10, 14)
val z = new Rational(3, 2)
x - y - z // infix notation
y + y // infix notation
x < y
x.max(y)


