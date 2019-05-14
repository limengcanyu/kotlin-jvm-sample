package com.kotlin.jvm.sample.collections

/**
 * <p>Description: count </p>
 *
 * count functions returns either the total number of elements in a collection or the number of elements matching the given predicate.
 *
 * @author Rock Jiang
 * @date 2019/5/14 0014
 * @version 1.0
 */
fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

    val totalCount = numbers.count()                     // 2
    val evenCount = numbers.count { it % 2 == 0 }        // 3

    println("Total number of elements: $totalCount")
    println("Number of even elements: $evenCount")
}

// 1. Defines a collection of numbers.
// 2. Counts the total number of elements.
// 3. Counts the number of even elements.