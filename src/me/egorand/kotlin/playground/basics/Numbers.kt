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

fun numbers() {
  val anInt = 1
  println(anInt)

  val aLong = 2L
  println(aLong)

  val aHexInt = 0x03
  println(aHexInt)

  val aBinaryInt = 0b00000100
  println(aBinaryInt)

  val aFloat = 5.0f
  println(aFloat)

  val aDouble = 6.0
  println(aDouble)
}

// boxing does not preserve identity!
fun boxedIdentity(n: Int) {
  val a: Int = n
  println(a === n)                    // checks for identity, will be 'true'
  val boxedA: Int? = a                // needs to be boxed to use with ?
  val anotherBoxedA: Int? = a
  println(boxedA === anotherBoxedA)   // 'false', '===' works like '==' in Java on objects
}

// ...but it preserves equality
fun boxedEquality(n: Int) {
  val a: Int = n
  println(a == n)
  val boxedA: Int? = a
  val anotherBoxedA: Int? = a
  println(boxedA == anotherBoxedA)   // 'true', '==' works like 'equals' in Java on objects
}

fun main(args: Array<String>) {
  numbers()
  boxedIdentity(10000)
  boxedEquality(10000)
}