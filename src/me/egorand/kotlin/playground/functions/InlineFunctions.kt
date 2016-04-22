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

// without 'inline' that would generate a new object for calling the function
// 'inline' allows the compiler to inline the function code
inline fun <T> withLock(lock: Lock, body: () -> T): T {
  lock.lock()
  try {
    return body()
  } finally {
    lock.unlock()
  }
}

// can use 'noinline' to avoid parameter function from being inlined
inline fun foo(inlined: () -> Unit, noinline notInlined: () -> Unit) {
}

fun main(args: Array<String>) {
  val aLock = ReentrantLock()
  println(withLock(aLock) { "Hi!" })
}