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

package egorand.kotlin

// can be anything, unlike Java

fun sumExplicitReturnType(a: Int, b: Int): Int {
  return a + b
}

// return type can be inferred, can also use '=' instead of 'return'
fun sumReturnTypeInferred(a: Int, b: Int) = a + b

fun printSumUnit(a: Int, b: Int): Unit {
  println(a + b)
}

// Unit return type can be omitted
fun printSumUnitOmitted(a: Int, b: Int) {
  println(a + b)
}

fun main(args: Array<String>) {
  println(sumExplicitReturnType(2, 2))
  println(sumReturnTypeInferred(2, 2))
  printSumUnit(2, 2)
  printSumUnitOmitted(2, 2)
}
