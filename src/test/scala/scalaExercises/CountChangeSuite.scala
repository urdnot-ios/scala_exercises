package scalaExercises
import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CountChangeSuite extends FunSuite {
  import com.urdnot.scalaExercises.recursives._
  ignore("countChange: example given in instructions") {
    assert(countChange(4,List(1,2)) === 3)
  }

  ignore("countChange: sorted CHF") {
    assert(countChange(300,List(5,10,20,50,100,200,500)) === 1022)
  }

  ignore("countChange: no pennies") {
    assert(countChange(301,List(5,10,20,50,100,200,500)) === 0)
  }

  ignore("countChange: unsorted CHF") {
    assert(countChange(300,List(500,5,50,100,20,200,10)) === 1022)
  }

  ignore("countChange: Maana 1") {
    assert(countChange(4,List(1,2,3)) === 4)
  }
  test("countChange: Maana 2") {
    assert(countChange(10,List(2,5,3,6)) === 5)
  }
  test("quiz") {
    assert(countChange(32, List( 1,8,20)) === 7)
  }
}
