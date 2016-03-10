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

package me.egorand.kotlin.playground.basicsyntax

fun getStringLengthSmart(arg: String): Int? {
  if (arg is String)
  // don't need an explicit cast
    return arg.length
  return null
}

fun getStringLengthSmarter(arg: String): Int? {
  if (arg !is String)
    return null
  // from now on compiler sees arg as a String
  return arg.length
}

fun getStringLengthSmartest(arg: String): Int? {
  // can call String methods in the same if block which checks type!
  if (arg is String && arg.length > 0)
    return arg.length
  return null
}

fun main(args: Array<String>) {
  println(getStringLengthSmart("abc"))
  println(getStringLengthSmarter("abcd"))
  println(getStringLengthSmartest("abcde"))
}