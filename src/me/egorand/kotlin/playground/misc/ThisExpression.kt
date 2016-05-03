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

class A {
  inner class B {
    fun Int.foo() {
      val a = this@A
      val b = this@B

      val c = this
      val c1 = this@foo

      val funLit = lambda@ fun String.() {
        val d = this
      }

      val funLit2 = { s: String ->
        val d = this
      }
    }
  }
}