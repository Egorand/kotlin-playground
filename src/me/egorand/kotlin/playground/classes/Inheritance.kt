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

package me.egorand.kotlin.playground.classes.inheritance

class Empty {}  // implicitly inherits from Any

// by default classes are final, need to use "open" to be able to subclass
open class Base(p: Int)

class Derived(p: Int) : Base(p)

open class Base1 {
  // same as for classes, methods are final by default
  open fun v() {
  }

  fun nv() {
  }
}

open class Derived1 : Base1() {
  // using "override" keyword, similar to Java's @Override
  final override fun v() {
  }

  //  override fun nv() {}  // doesn't compile, nv() is final in parent
}

class Derived2 : Derived1() {

  //  override fun v() {}   // doesn't compile, since is v() is declared final
}

open class A {

  open fun f() {
    println("A")
  }

  fun a() {
    println("a")
  }
}

// interfaces can have method implementations, as in Java 8
interface B {
  // interface members are open by default
  fun f() {
    println("B")
  }

  fun b() {
    println("b")
  }
}

class C : A(), B {
  // have to override f(), since it inherits multiple implementations
  override fun f() {
    super<A>.f()  // super implementation from A()
    super<B>.f()  // super implementation from B()
  }
}

fun main(args: Array<String>) {
  val c = C()
  c.f()
}