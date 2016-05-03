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

fun printObj(obj: Any) {
  when (obj) {
    is Int -> println(obj + 1)
    is String -> println(obj.length)
    is IntArray -> println(obj.sum())
  }
}

fun main(args: Array<String>) {
  val obj = "Hello world!"
  if (obj !is String) {
    println("Not a String")
  } else {
    // compiler is smart enough to cast the obj to String for us,
    // so we can safely call length() without explicit casting
    println(obj.length)
  }

  // smart casts work in right hand side of || and &&
  if (obj is String && obj.length > 5) println(obj.first())

  printObj(obj)

  val nullable = null
  //  val nullableStr = nullable as String  // unsafe cast, will throw exception!
  val nullableStr1 = nullable as String?
  println(nullableStr1)
  val nullableStr2 = nullable as? String
  println(nullableStr2)
}