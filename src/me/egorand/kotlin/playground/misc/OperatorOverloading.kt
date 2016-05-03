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

import java.math.BigInteger

data class Fraction(val numerator: Int = 0, val denominator: Int = 1) {

  companion object {
    fun create(numerator: Int, denominator: Int): Fraction {
      val gcd = BigInteger.valueOf(numerator.toLong())
          .gcd(BigInteger.valueOf(denominator.toLong())).toInt()
      return Fraction(numerator / gcd, denominator / gcd)
    }
  }

  operator fun unaryPlus() = Fraction.create(+numerator, denominator)

  operator fun unaryMinus() = Fraction.create(-numerator, denominator)

  operator fun inc() = Fraction.create(numerator + 1, denominator)

  operator fun dec() = Fraction.create(numerator - 1, denominator)

  operator fun plus(b: Fraction) =
      Fraction.create(numerator * b.denominator + b.numerator * denominator,
          denominator * b.denominator)

  operator fun minus(b: Fraction) =
      Fraction.create(numerator * b.denominator - b.numerator * denominator,
          denominator * b.denominator)

  operator fun times(b: Fraction) =
      Fraction.create(numerator * b.numerator, denominator * b.denominator)

  operator fun div(b: Fraction) =
      Fraction.create(numerator * b.denominator, b.numerator * denominator)

  override fun toString(): String {
    return "$numerator" + if (denominator > 1) "/$denominator" else ""
  }
}

fun main(args: Array<String>) {
  println(Fraction.create(1, 2))

  println(+Fraction.create(-1, 2))
  println(-Fraction.create(1, 2))

  var frac1 = Fraction.create(3, 4)
  frac1++
  println(frac1)
  frac1--
  println(frac1)

  val frac2 = Fraction.create(1, 3)
  val frac3 = Fraction.create(1, 5)
  println(frac2 + frac3)
  println(frac2 - frac3)
  println(frac2 * frac3)
  println(frac2 / frac3)
}