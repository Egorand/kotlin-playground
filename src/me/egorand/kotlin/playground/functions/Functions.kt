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

package me.egorand.kotlin.playground.functions

import java.util.*

// allows using infix notation for calling this function
infix fun Int.greaterThan(other: Int): Boolean {
  return this >= other
}

// default arguments
fun print(s: String, from: Int = 0, to: Int = s.length) {
  for (i in from..to - 1) {
    print(s[i])
  }
  println()
}

// single expression function: can omit braces
// can omit return type, if can be inferred by the compiler
fun double(x: Int) = x * 2

// function with var args
fun <T> asList(vararg ts: T): List<T> {
  val list = ArrayList<T>()
  for (t in ts) {
    list.add(t)
  }
  return list
}

// functions can be nested
fun capitalized(strings: List<String>): List<String> {
  fun capitalize(s: String) =
      if (s.length > 0) Character.toUpperCase(s[0]) + s.substring(1, s.length)
      else s

  return strings.map { capitalize(it) }
}

// tail-recursive function, that will be optimized into a loop by the compiler
tailrec fun findFixPoint(x: Double = 1.0): Double
    = if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))

fun main(args: Array<String>) {
  println(5 greaterThan 2)

  print("Hello")
  print("Hello", 2)
  print("Hello", 2, 4)
  print("Hello", from = 2, to = 4)  // named arguments

  println(double(3))

  println(asList(1, 2, 3))

  val a = arrayOf(3, 4)
  println(asList(1, 2, *a, 5))  // the "spread" operator can flatten an array

  val fruits = listOf("apple", "banana", "cherry")
  println(capitalized(fruits))

  println(findFixPoint(2.0))
}