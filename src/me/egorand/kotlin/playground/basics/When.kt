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

fun checkNumber(x: Int) {
  when (x) {
    1 -> println("x == 1")
    2 -> println("x == 2")
    else -> {
      println("x is neither 1 nor 2")
    }
  }
}

fun checkNumber2(x: Int) {
  when (x) {
    0, 1 -> println("x == 0 or x == 1") // using comma to check against multiple values
    else -> println("otherwise")
  }
}

val validNumbers = arrayOf(100, 200, 300)

fun checkNumber3(x: Int) {
  when (x) {
    in 1..10 -> println("x is in the range")  // checking if the argument is in the range
    in validNumbers -> println("x is valid")
    !in 10..20 -> println("x is outside the range")
    else -> println("none of the above")
  }
}

fun checkString(s: Any) {
  when (s) {
    is String -> println(s.startsWith("hello")) // check for the argument type and do a smart cast
    else -> println("false")
  }
}

fun main(args: Array<String>) {
  checkNumber(1)
  checkNumber(2)
  checkNumber(3)

  checkNumber2(0)
  checkNumber2(2)

  checkNumber3(3)
  checkNumber3(100)
  checkNumber3(21)
  checkNumber3(11)

  checkString("hello world")
  checkString(1)
}