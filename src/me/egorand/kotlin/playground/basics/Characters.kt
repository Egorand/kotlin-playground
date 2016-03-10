/*
 * Copyright 2016 Egor Andreevici
 *
 *      Licensed under the Apache License, Version 2.0 (the "License");
 *      you may not use this file except in compliance with the License.
 *      You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *      Unless required by applicable law or agreed to in writing, software
 *      distributed under the License is distributed on an "AS IS" BASIS,
 *      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *      See the License for the specific language governing permissions and
 *      limitations under the License.
 *
 */

package me.egorand.kotlin.playground.basics

fun check(c: Char): Boolean {
  //  return c == 1     // won't compile, Chars are not numbers in Kotlin!
  return false
}

fun parseDigitChar(c: Char): Int {
  if (c !in '0'..'9') {
    throw IllegalArgumentException("$c is not a digit character!")
  }
  return c.toInt() - '0'.toInt()
}

fun main(args: Array<String>) {
  println(parseDigitChar('8'))
}