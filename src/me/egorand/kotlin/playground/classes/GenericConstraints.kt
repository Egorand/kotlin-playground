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

fun <T : Comparable<T>> sort(list: MutableList<T>) {
  // sort
}

//fun <T> cloneWhenGreater(list: List<T>, threshold: T): List<T>
//    where T : Comparable<T>, T : Cloneable<T> {
//  return list.filter { it > threshold }.map { it }
//}

fun main(args: Array<String>) {
  val list = listOf(1, 2, 3, 4)
  //  val cloned = cloneWhenGreater(list, 2)
  //  println(cloned)
}