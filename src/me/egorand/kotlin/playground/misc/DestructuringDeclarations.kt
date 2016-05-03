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

data class Employee(val name: String, val role: String)

fun main(args: Array<String>) {
  val (name, role) = Employee("Alice", "Software Engineer")
  println("$name is a $role")

  val team = listOf(
      Employee("Alice", "SE"),
      Employee("Bob", "QA"),
      Employee("Christine", "PM"))
  for ((name, role) in team) {
    println("$name is the $role")
  }

  val capitals = mapOf(
      "Germany" to "Berlin",
      "United Kingdom" to "London",
      "USA" to "Washington")
  for ((key, value) in capitals) {
    println("The capital of $key is $value")
  }
}