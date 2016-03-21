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

class Incrementer {

  fun increment(n: Int) = n + 1
}

class IncrementerTest {

  lateinit var incrementer: Incrementer

  fun setUp() {
    incrementer = Incrementer()
  }

  fun shouldIncrementValueProperly() {
    val inc = incrementer.increment(1)
    if (inc != 2) {
      throw AssertionError("expected <2> but was <$inc>")
    }
  }
}

fun main(args: Array<String>) {
  val test = IncrementerTest()

  // incorrect: will throw, since test subject is not initialized yet
  //  test.shouldIncrementValueProperly()

  // correct
  test.setUp()
  test.shouldIncrementValueProperly()
}