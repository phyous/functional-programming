package recfun

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FactSuite extends FunSuite {
  import Main.fact
  test("countChange: example given in instructions") {
    assert(fact(5) === 120)
  }

}
