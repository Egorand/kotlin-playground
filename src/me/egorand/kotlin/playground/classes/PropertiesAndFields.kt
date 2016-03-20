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

class Properties(simple: Int?) {

  // vars are mutable variables
  var allByDefault: Int? = 0
  var initialized = 1

  // vals are immutable variables
  val simple: Int? = simple
  val inferredType = 1

  val size: Int = 0

  // custom getter
  val isEmpty: Boolean
    get() = this.size == 0

  var intField: Int? = null

  var stringRepresentation: String
    get() = this.toString()
    set(value) {
      intField = Integer.parseInt(value)
    }

  // private setter with default implementation
  var setterVisibility: String = "abc"
    private set
}

fun main(args: Array<String>) {
  val p = Properties(1)

  p.stringRepresentation = "23"
  println(p.intField);
}