package com.kotlin.jvm.sample.collections

/**
 * <p>Description: flatMap </p>
 *
 * flatMap transforms each element of a collection into an iterable object and builds a single list of the transformation results.
 * The transformation is user-defined.
 *
 * @author Rock Jiang
 * @date 2019/5/14 0014
 * @version 1.0
 */
fun main() {

    val numbers = listOf(1, 2, 3)                        // 1

    val tripled = numbers.flatMap { listOf(it, it, it) } // 2

    println("Numbers: $numbers")
    println("Transformed: $tripled")
}

// 1. Defines a collection of numbers.
// 2. Builds a list in which every collection element is repeated three times.
//    Important thing is that it's not a list of lists; it's a list of integers with nine elements.