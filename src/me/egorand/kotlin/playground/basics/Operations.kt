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

fun bitwise() {
  val a = 0b00000010 shl 1          // 2 << 1
  println(a)

  val b = 0b00000110 shr 1          // 6 >> 1
  println(b)

  val c = 0b00001010 and 0b00000101 // 10 & 5
  println(c)

  val d = 0b00001010 or 0b00000101  // 10 | 5
  println(d)

  val e = 0b00001010 xor 0b00000101 // 10 ^ 5
  println(e)

  val f = 0b00001010.inv()          // !10
  println(f)
}

fun main(args: Array<String>) {
  bitwise()
}