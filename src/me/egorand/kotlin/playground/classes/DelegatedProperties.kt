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

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class Example {
  var p: String? by LoggerDelegate<String>()

  // lazy property that will only be computed once
  val lazy: String by lazy {
    println("computed!")
    "Hello"
  }

  // observable delegate helps intercept setters and getters
  var name: String by Delegates.observable("<no name>") {
    property, old, new ->
    println("$old -> $new")
  }
}

// custom property delegate that will be mixed into setter and getter logic
class LoggerDelegate<T> {

  var t: T? = null

  operator fun getValue(thisRef: Any?, property: KProperty<*>): T? {
    println("getting $t")
    return t
  }

  operator fun setValue(thisRef: Any?, property: KProperty<*>, newValue: T?) {
    println("setting $newValue")
    this.t = newValue
  }
}

// delegating setters to a map - will initialize fields based on keys
class DelegateUser(val map: Map<String, Any?>) {
  val name: String by map
  val age: Int by map
}

fun main(args: Array<String>) {
  val ex = Example()
  ex.p = "Hello world!"
  println(ex.p)

  println(ex.lazy)
  println(ex.lazy)

  ex.name = "First"
  ex.name = "Second"

  val user = DelegateUser(mapOf(
      "name" to "John Doe",
      "age" to 25))
  println(user.name)
  println(user.age)
}