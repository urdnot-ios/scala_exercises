package scalaExercises

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class StringSuite extends FunSuite {
  import com.urdnot.scalaExercises.strings._

  test("is unique false") {
    assert(isUniqueChars("hello there") === false)
  }
  test("is unique true") {
    assert(isUniqueChars("nique") === true)
  }
}
