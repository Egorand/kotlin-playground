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

package me.egorand.kotlin.playground.classes

import java.util.*

// classes in Kotlin don't have fields, but for some cases (e.g. custom accessors) backing fields can be created and
// accessed via 'field'
class BackingFields {

  // backing field will be generated since setter has default implementation
  var counter = 0
    set(value) {
      if (value > 0) {
        field = value
      }
    }

  var size = 0

  // no backing fields will be generated
  val isEmpty: Boolean
    get() = this.size == 0

  // another option is using backing properties, which are just like Java fields
  private var _table: Map<String, Int>? = null

  val table: Map<String, Int>
    get() {
      if (_table == null) {
        _table = HashMap()
      }
      return _table ?: throw RuntimeException("can't smart cast, value has probably been changed")
    }
}

fun main(args: Array<String>) {
  val bf = BackingFields()
  bf.counter = -1
  println(bf.counter)
  bf.counter = 4
  println(bf.counter)

  bf.size = 0
  println(bf.isEmpty)
  bf.size = 5
  println(bf.isEmpty)

  val table = bf.table
  println(table)
}