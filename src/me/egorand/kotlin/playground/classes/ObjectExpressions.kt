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

class MouseEvent

interface MouseAdapter {

  fun onMouseClicked(e: MouseEvent) {
  }

  fun onMouseEntered(e: MouseEvent) {
  }
}

class Window {

  val mouseListeners: List<MouseAdapter> = listOf()

  fun addMouseListener(listener: MouseAdapter) {
    mouseListeners + listener
  }
}

open class A(x: Int) {
  open val y: Int = x
}

interface B

fun countClicks(window: Window) {
  var clickCount = 0
  var enterCount = 0

  // objects have access to to variables in enclosing scope, not limited to final
  window.addMouseListener(object : MouseAdapter {
    override fun onMouseClicked(e: MouseEvent) {
      clickCount++
    }

    override fun onMouseEntered(e: MouseEvent) {
      enterCount++
    }
  })
}

fun main(args: Array<String>) {

  // creating an implementation of the interface, similar to Java's anonymous classes
  val window = Window()
  window.addMouseListener(object : MouseAdapter {
    override fun onMouseClicked(e: MouseEvent) {
      println("Mouse clicked")
    }

    override fun onMouseEntered(e: MouseEvent) {
      println("Mouse entered")
    }
  })

  // can create objects of different types at the same time
  val ab = object : A(1), B {
    override val y: Int = 15
  }

  // or just an object
  val adHoc = object {
    val x = 1
    val y = 2
  }
  println("${adHoc.x} + ${adHoc.y}")
}