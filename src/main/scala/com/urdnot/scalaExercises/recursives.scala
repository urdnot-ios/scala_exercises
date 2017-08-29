package com.urdnot.scalaExercises

/**
  * Created by jsewell on 4/24/17.
  */
object recursives {
  def countChange(money: Int, coins: List[Int]): Int = {
    def loop(amount: Int, coins: List[Int]): Int = {
      if (amount == 0) 1
      else if (amount > 0 && coins.nonEmpty)
        loop(amount, coins.tail) + loop(amount - coins.head, coins)
      else 0
    }
    loop(money, coins)
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
  //find the pivot number of sum. Eg: [2,3,8,4,1]
  def pascal(cols: Int, rows: Int): Int =
    if (rows == 0) {
      1
    } else if (cols <= 0 || cols >= rows) {
      1
    } else {
      pascal(cols - 1, rows - 1) + pascal(cols, rows - 1)
    }

  /**
    * The first two Fibonacci numbers are 0 and 1. The nth number is always the sum of the previous two—the sequence begins 0, 1, 1, 2, 3, 5. Your definition should use a local tail-recursive function.
    *
    * Fn = Fn-1 + Fn-2
    * Seed values: F0 = 0, F1 = 1
    *
    * @param n
    * @return
    */
  def fibonacci(n: Int) = {
    def loop(n: Int, fn1: Int = 0, fn2: Int = 1): Int = {
      n match {
        case 0 => fn1
        case _ => loop(n - 1, fn2, fn1 + fn2)
      }
    }
    loop(n)
  }
  def lcm(a: BigInt, b: BigInt): BigInt = a * b / a.gcd(b)
  def gcd(a: Int,b: Int): Int = {
    if(b == 0) a else gcd(b, a % b)
  }
}
