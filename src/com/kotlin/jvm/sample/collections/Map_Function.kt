@file:JvmName("MapKt")

package com.kotlin.jvm.sample.collections

/**
 * <p>Description: map extension function </p>
 *
 * map extension function enables you to apply a transformation to all elements in a collection.
 * It takes a transformer function as a lambda-parameter.
 *
 * @author Rock Jiang
 * @date 2019/5/14 0014
 * @version 1.0
 */
fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)     // 1

    val doubled = numbers.map { x -> x * 2 }      // 2

    val tripled = numbers.map { it * 3 }          // 3

    println("Numbers: $numbers")
    println("Doubled Numbers: $doubled")
    println("Tripled Numbers: $tripled")
}

// 1. Defines a collection of numbers.
// 2. Doubles numbers.
// 3. Uses the shorter it notation to triple the numbers.