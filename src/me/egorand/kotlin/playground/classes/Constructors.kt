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

// declaring primary constructor
class Person1 constructor(firstName: String) {}

// or if no visibility modifiers or annotations
class Person2(firstName: String) {}

// primary constructors can't contain any code
class Customer1(name: String) {
  // must use initializer blocks
  init {
    println("customer with name $name")
  }
}

class Customer2(name: String) {
  val customerKey = name.toUpperCase()
}

// shorthand for declaring fields
class Person3(val firstName: String, val lastName: String, var age: Int)

class Person4 {
  // secondary constructor
  constructor(firstName: String) {
    println("name = $firstName")
  }
}

class Person5(val firstName: String) {
  // if there's a primary constructor, all secondary constructors must delegate to it
  constructor(firstName: String, lastName: String) : this(firstName) {
    println("last name = $lastName")
  }

  // indirectly delegates to primary constructor
  constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
    println("age = $age")
  }
}

// default constructor will be created for a class with no constructors, as in Java
class DontCreateMe private constructor() {}

fun main(args: Array<String>) {
  // creating instances, Kotlin doesn't have the "new" keyword
  println(Person1("Alice"))
  println(Person2("Bob"))
  println(Customer1("Carl"))
  println(Customer2("Daisy"))
  println(Person3("Eric", "Smith", 30))
  println(Person4("Frank"))
  println(Person5("Gary"))
  println(Person5("Hailey", "Smith"))
  println(Person5("Ian", "Smith", 31))
  //  println(DontCreateMe())   // won't compile
}