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

fun printChars(s: String) {
  // 'in' can be used to iterate over characters in a String
  for (c in s) {
    print("$c, ")
  }
  println()
}

fun rawStrings() {
  // open and close a raw string with """, formatting will be preserved inside
  val text = """
    for (c in "foo")
      print(c)
  """
  println(text)
}

fun templates() {
  val i = 10
  println("i = $i")

  val abc = "abc"
  println("$abc.length is ${abc.length}")

  val price = """
  ${'$'}9.99
  """
  println(price)
}

fun main(args: Array<String>) {
  printChars("Hello!")
  rawStrings()
  templates()
}