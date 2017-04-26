package scalaExercises

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class BalanceSuite extends FunSuite {
  import com.urdnot.scalaExercises.recursives._
  test("balance: '(if (zero? x) max (/ 1 x))' is balanced") {
    assert(balance_parens("(if (zero? x) max (/ 1 x))".toList))
  }

  test("balance: 'I told him ...' is balanced") {
    assert(balance_parens("I told him (that it's not (yet) done).\n(But he wasn't listening)".toList))
  }

  test("balance: ':-)' is unbalanced") {
    assert(!balance_parens(":-)".toList))
  }

  test("balance: counting is not enough") {
    assert(!balance_parens("())(".toList))
  }

}
