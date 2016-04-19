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

class E {

  fun bar() {
    println("E.bar")
  }
}

class F {

  fun baz() {
    println("F.baz")
  }

  // this extension is only visible inside F
  fun E.foo() {
    // E is the implicit call recipient here, as well as F
    bar()
    baz()

    println(toString())  // can be called on both E and F, but E takes precedence
    println(this@F.toString())
  }

  fun call(e: E) {
    e.foo()
  }
}

fun main(args: Array<String>) {
  val e = E()
  val f = F()
  f.call(e)
}