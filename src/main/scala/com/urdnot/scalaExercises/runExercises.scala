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
}