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

import java.util.*

class Controller {
  // _items is mutable inside the class
  private val _items = mutableListOf<String>()
  // but only exposed as a snapshot, which is immutable
  val items: List<String> get() = _items.toList()
}

fun main(args: Array<String>) {
  val numbers: MutableList<Int> = mutableListOf(1, 2, 3)
  val readOnlyView: List<Int> = numbers

  println(numbers)
  numbers.add(4)
  println(readOnlyView)
  //  readOnlyView.clear()  won't compile

  val strings = hashSetOf("a", "b", "c", "c")
  println(strings.size)

  // fun with Lists
  val items = listOf(1, 2, 3, 4)
  println(items.first() == 1)
  println(items.last() == 4)
  println(items.filter { it % 2 == 0 })
  println(items.requireNoNulls())
  if (items.none { it > 6 }) println("No items above 6")
  println(items.firstOrNull())

  // fun with maps
  val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
  println(readWriteMap["foo"])
  val snapshot: Map<String, Int> = HashMap(readWriteMap)
  println(snapshot)
}