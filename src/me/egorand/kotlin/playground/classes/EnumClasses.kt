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

enum class Direction {
  NORTH, SOUTH, WEST, EAST
}

enum class Color(val rgb: Int) {
  RED(0xFF0000),
  GREEN(0x00FF00),
  BLUE(0x0000FF);

  override fun toString(): String {
    return "$name: $rgb"
  }
}

enum class ProtocolState {
  WAITING {
    override fun signal(): ProtocolState = TALKING
  },
  TALKING {
    override fun signal(): ProtocolState = WAITING
  };

  abstract fun signal(): ProtocolState
}

fun main(args: Array<String>) {
  Direction.values().forEach { println(it) }
  Color.values().forEach { println(it) }
  ProtocolState.values().forEach { println(it.signal()) }
}