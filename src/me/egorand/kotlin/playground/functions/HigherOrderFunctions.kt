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

package me.egorand.kotlin.playground.functions

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

fun <T> lock(lock: Lock, body: () -> T): T {
  lock.lock()
  try {
    return body()
  } finally {
    lock.unlock()
  }
}

fun syncProduceString() = "Hello"

// higher order function with function type as the parameter
fun <T, R> List<T>.map(transform: (T) -> R): List<R> {
  val result = arrayListOf<R>()
  for (elem in this) {
    result.add(transform(elem))
  }
  return result
}

fun main(args: Array<String>) {
  val reentrantLock = ReentrantLock()

  // passing the function ref
  val result1 = withLock(reentrantLock, ::syncProduceString)
  println(result1)

  // passing a lambda expression
  val result2 = withLock(reentrantLock, { syncProduceString() })
  println(result2)

  // valid syntax if function is the last parameter of the method
  val result3 = withLock(reentrantLock) {
    syncProduceString()
  }
  println(result3)

  val list = listOf(1, 2, 3, 4, 5)
  println(list.map { it * 2 })

  val fruits = listOf("apple", "banana", "cherry")
  println(fruits.filter { it.length == 5 }.sortedBy { it }.map { it.toUpperCase() })
}