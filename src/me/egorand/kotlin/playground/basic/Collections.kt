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

package me.egorand.kotlin.playground.basic

fun printNames(names: List<String>) {
  for (name in names) {
    println(name)
  }
}

fun hasName(names: List<String>, name: String): Boolean = name in names

fun doLotsOfFancyStuff(names: List<String>) {
  names
      .filter { it.startsWith("A") }
      .sortedBy { it }
      .map { it.toUpperCase() }
      .forEach { println(it) }
}

fun main(args: Array<String>) {
  val names = listOf("Alice", "Bob", "Adam", "Chris", "Erica")
  printNames(names)
  println(hasName(names, "Bob"))
  doLotsOfFancyStuff(names)
}