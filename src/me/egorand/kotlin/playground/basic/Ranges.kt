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

package me.egorand.kotlin.playground.basic

fun isInRange(n: Int, from: Int, to: Int) =
    if (n in from..to) true else false

fun indexInArray(i: Int, a: IntArray) =
    if (i !in 0..a.lastIndex) false else true

fun printRange(from: Int, to: Int) {
  for (n in from..to) {
    print("${n} ")
  }
}

fun main(args: Array<String>) {
  println(isInRange(5, 2, 7))
  println(indexInArray(1, intArrayOf(1, 2, 3)))
  printRange(3, 6)
}
