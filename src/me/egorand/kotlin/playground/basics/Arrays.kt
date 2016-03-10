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

import java.util.*

fun createArrays() {
  val a = arrayOf(1, 2, 3)
  println(Arrays.toString(a)) // aah, still no useful toString() implementation...

  val b: Array<Int?> = arrayOfNulls(3) // type needs to be specified here
  println(Arrays.toString(b))

  val c = Array(5, { (it * it).toString() })
  println(Arrays.toString(c))
}

fun invariantArrays() {
  //  val a: Array<Any> = Array<String>()   // won't compile, arrays are invariant in Kotlin (covariant in Java)
}

fun primitiveArrays() {
  val a: IntArray = intArrayOf(1, 2, 3)
  println(a)

  val b: ByteArray = byteArrayOf(1, 2, 3)
  println(b)

  val c: ShortArray = shortArrayOf(1, 2, 3)
  println(c)
}

fun main(args: Array<String>) {
  createArrays()
  primitiveArrays()
}