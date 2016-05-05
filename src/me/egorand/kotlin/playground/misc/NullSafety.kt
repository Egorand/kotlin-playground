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

package me.egorand.kotlin.playground.misc

fun main(args: Array<String>) {
  var a: String = "abc"
  //  a = null  // won't compile, a can't be null!

  var b: String? = "abc"
  b = null      // b can be null, since type is String? vs String

  println(a.length)
  //  println(b.length)   // won't compile, since b can be null!

  println(if (b != null) b.length else -1)
  println(b?.length)
  println(b?.length ?: -1)

  try {
    println(b!!.length)   // will compile, but will throw an NPE
  } catch (e: NullPointerException) {
    println("NPE!")
  }
}