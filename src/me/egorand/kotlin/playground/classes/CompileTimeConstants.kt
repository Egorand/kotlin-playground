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

import java.util.*

// this is a compile time constant
const val SUBSYSTEM_DEPRECATED = "This subsystem is deprecated"

// it can only be a String or a primitive type
//const val TABLE: Map<String, String> = HashMap()    // error

class Constants1 {

  // cannot be placed inside a class
  //  const val TAG = "Constants"
}

object Constants2 {

  // but can be inside an object
  const val TAG = "Constants"
}

// compile-time constants can be used inside annotations, unlike in Java
@Deprecated(SUBSYSTEM_DEPRECATED) fun foo() {
}
