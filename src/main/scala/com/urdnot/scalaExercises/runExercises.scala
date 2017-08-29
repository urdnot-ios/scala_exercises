package com.urdnot.scalaExercises


/**
  * Created by jsewell on 4/21/17.
  */
object runExercises extends App {
  import recursives._

  println("List max")
  println(Lists.max(List(1,3,2)))
  println("List sum")
  println(Lists.sum(List(3,5,7)))

  println("Pascal's Triangle")
  for (row <- 0 to 10) {
    for (col <- 0 to row)
      print(pascal(col, row) + " ")
    println()
  }

  println("balanced parentheses")
  print("(if (zero? x) max (/ 1 x))  ")
  println(balance_parens("(if (zero? x) max (/ 1 x))".toList))
  print(":-)  ")
  println(balance_parens(":-)".toList))

  println("fib: ")
  /*
  { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 }
   */
  println("0 = 1: " + fibonacci(0))
  println("1 = 1: " + fibonacci(1))
  println("2 = 2: " + fibonacci(2))
  println("3 = 3: " + fibonacci(3))
  println("4 = 5: " + fibonacci(4))
  println("5 = 6: " + fibonacci(5))
  println("6 = 13: " + fibonacci(6))
  println("10 = 55: " + fibonacci(10))
}