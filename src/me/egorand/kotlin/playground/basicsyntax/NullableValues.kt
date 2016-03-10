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

package me.egorand.kotlin.playground.basicsyntax

// won't compile without '?', since 'null' can be returned
fun parseInt(arg: String): Int? {
  try {
    return arg.toInt()
  } catch (e: NumberFormatException) {
    return null
  }
}

fun main(args: Array<String>) {
  if (args.size < 2) {
    println("Two arguments expected")
    return
  }

  val x = parseInt(args[0])
  val y = parseInt(args[1])

  // won't compile, since x and y can be null
  //  println(x * y)

  if (x != null && y != null) {
    println(x * y)
  }
}