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

fun main(args: Array<String>) {
  for (i in 1..4) print(i)
  println()

  for (i in 4..1) print(i)              // prints nothing
  for (i in 4 downTo 1) print(i)        // prints "4321"
  println()

  for (i in 1..4 step 2) print(i)       // prints "13"
  println()
  for (i in 4 downTo 1 step 2) print(i) // prints "42"
  println()
}