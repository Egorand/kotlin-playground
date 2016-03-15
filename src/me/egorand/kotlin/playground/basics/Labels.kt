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

fun breakOuterLoop() {
  outer@ for (i in 1..3) {
    for (j in 1..3) {
      if (i > 1 && j > 1) {
        break@outer
      }
      println("i = $i, j = $j")
    }
  }
}

fun returnFromLambda() {
  val ints = arrayOf(1, 2, 0, 3)
  ints.forEach {
    if (it == 0) return
    println(it)
  }
  println("Won't be printed!")
}

fun returnFromLambda2() {
  val ints = arrayOf(1, 2, 0, 3)
  ints.forEach loop@ {
    if (it == 0) return@loop
    println(it)
  }
  println("Will be printed!")
}

fun returnFromLambda3() {
  val ints = arrayOf(1, 2, 0, 3)
  ints.forEach {
    if (it == 0) return@forEach
    println(it)
  }
  println("Will be printed!")
}

fun returnFromLambda4() {
  val ints = arrayOf(1, 2, 0, 3)
  ints.forEach(fun(value: Int) {
    if (value == 0) return
    println(value)
  })
  println("Will be printed!")
}

fun main(args: Array<String>) {
  breakOuterLoop()
  returnFromLambda()
  returnFromLambda2()
  returnFromLambda3()
  returnFromLambda4()
}