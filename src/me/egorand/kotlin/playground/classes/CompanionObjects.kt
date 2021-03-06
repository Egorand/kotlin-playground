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

interface Factory<T> {
  fun create(): T
}

class MyNewClass {

  // accessed as a static member in Java, can implement interface and extend classes
  // will be initialized lazily, when accessed for the first time
  companion object : Factory<MyNewClass> {
    override fun create(): MyNewClass {
      return MyNewClass()
    }
  }
}

fun main(args: Array<String>) {
  val instance = MyNewClass.create()
  println(instance)
}