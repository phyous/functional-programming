import math.abs

val tolerance = 0.0001
def isCLoseEnough(x: Double, y: Double) =
  abs((x - y) / x) / x < tolerance

def fixedPoint(f: Double => Double)(firstGuess: Double) = {
  def iterate(guess: Double): Double = {
    val next = f(guess)
    if (isCLoseEnough(guess, next)) next
    else iterate(next)
  }
  iterate(firstGuess)
}

def averageDamp(f: Double => Double)(x: Double) = (x + f(x))/2

def sqrt(x:Double) = {
  fixedPoint(averageDamp(y => x/y))(x)
}

sqrt(2)