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

// Source is a Producer of T
abstract class Source<out T> {
  abstract fun nextT(): T
  //  abstract fun setT(t: T) // error! T can only occur in 'out' positions
}

fun demo1(strs: Source<String>) {
  val objs: Source<Any> = strs // fine!
}

// Comparable is a Consumer of T
abstract class Comparable<in T> {
  abstract operator fun compareTo(other: T): Int
}

fun demo1(x: Comparable<Number>) {
  x.compareTo(1.0)  // fine!
  val y: Comparable<Int> = x  // fine!
}