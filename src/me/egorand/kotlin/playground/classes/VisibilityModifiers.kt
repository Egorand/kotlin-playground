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

open class Outer {

  private val a = 1
  protected val b = 2
  internal val c = 3
  val d = 4 // public by default

  protected class Nested {

    public val e: Int = 5
  }
}

class Subclass : Outer() {
  init {
    //    println(a)  // not visible
    println(b)
    println(c)
    println(d)

    val nested = Nested()
    println(nested)
    println(nested.e)
  }
}

class Unrelated(o: Outer) {
  init {
    //    println(o.a)  // not visible
    //    println(o.b)  // not visible
    println(o.c)
    println(o.d)

    //    val nested = Nested() // not visible
  }
}

fun main(args: Array<String>) {
  Subclass()
  Unrelated(Outer())
}