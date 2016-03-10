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

fun noExplicitConversion() {
  val a: Int? = 1
  //  val b: Long = a     // won't compile!
  //  print(a == b)       // what would that yield?

  val b: Byte = 1
  //  val i: Int = b      // this is an error

  val i: Int = b.toInt()  // but this works!
  println(i)

  val l = 2L + 3          // this will work, types are inferred automatically
  println(l)
}

fun main(args: Array<String>) {
  noExplicitConversion()
}