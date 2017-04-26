package com.urdnot.scalaExercises

/**
  * Created by jsewell on 4/24/17.
  */
object recursives {
  def countChange(money: Int, coins: List[Int]): Int = {
    def count(money: Int, change: List[Int]) : Int = {
      if (change.isEmpty) 0
      else if (money - change.head == 0) 1
      else if (money - change.head < 0) 0
      else countChange(money - change.head, change) + countChange(money, change.tail)
    }
    count(money, coins.sorted)
  }

  def balance_parens(chars: List[Char]): Boolean = {
    def loop(chars: List[Char], open: Int): Boolean = {
      if (chars.isEmpty) open == 0
      else
      if (chars.head == '(') loop(chars.tail, open + 1)
      else
      if (chars.head == ')') open > 0 && loop(chars.tail, open -1)
      else loop(chars.tail, open)
    }
    loop(chars, 0)
  }
  def pascal(cols: Int, rows: Int): Int =
    if (rows == 0) {
      1
    } else if (cols <= 0 || cols >= rows) {
      1
    } else {
      pascal(cols - 1, rows - 1) + pascal(cols, rows - 1)
    }
}
