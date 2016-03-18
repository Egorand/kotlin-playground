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

import me.egorand.kotlin.playground.classes.Expr.Const
import me.egorand.kotlin.playground.classes.Expr.Sum
import me.egorand.kotlin.playground.classes.Expr.NotANumber

// all subclasses of a sealed class must be declared inside
sealed class Expr {
  class Const(val number: Double) : Expr() {}
  class Sum(val expr1: Expr, val expr2: Expr) : Expr() {}

  object NotANumber : Expr() {}
}

fun eval(expr: Expr): Double = when (expr) {
  is Const -> expr.number
  is Sum -> eval(expr.expr1) + eval(expr.expr2)
  NotANumber -> Double.NaN
}

fun main(args: Array<String>) {
  val expr = Sum(Sum(Const(2.0), Const(3.0)), Const(5.0))
  println(eval(expr))
}