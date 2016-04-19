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

data class Holder<T>(var t: T)

fun badCopy(from: Holder<Any>, to: Holder<Any>) {
  to.t = from.t
}

fun goodCopy(from: Holder<out Any>, to: Holder<Any>) {
  to.t = from.t
}

fun main(args: Array<String>) {
  val intHolder: Holder<Int> = Holder(1)
  val anyHolder = Holder<Any>(2)

  //  badCopy(intHolder, anyHolder)   // doesn't work, Holder<Any> is expected as from!

  goodCopy(intHolder, anyHolder)
  println(anyHolder)
}
