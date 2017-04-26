package com.urdnot.scalaExercises

/**
  * Created by jsewell on 4/24/17.
  */
object strings {
  /**
    * isUnique: return boolean if string has all unique characters
    *
    */
  def isUniqueChars(str: String): Boolean = {
    if (str.isEmpty) true
    def loop(character: Char, string: String): Boolean = {
      if (string.isEmpty) true
      else if (string.contains(character)) false
      else loop(string.head, string.tail)
    }
    loop(str.head, str.tail)
  }
  /**
    * checkPermutation: return boolean if two strings are permutations of each other
    */

  /**
    * url-ify: return a string where all whitespaces have been replaced with %20
    */

  /**
    * palindrome: two word input, boolean output, can the two words be rearranged to be a palindrome?
    */
  /**
    * one away: given two strings, determine if one is insert/remove/replaced away from the other
    */
  /**
    * compression: input a string, return a string with repeat characters as a number aabcccccaaa = a2b1c5a3
    */
  /**
    * rotate matrix 90 degrees
    */
  /**
    * zero out a matrix: if one element of a col/row is 0, then whole col+row becomes 0
    */
  /**
    * is substring: two string input, check if 2 is a shuffle/rotation of 1, "waterbottle" is a rotation of "erbottlewat"
    */
}
