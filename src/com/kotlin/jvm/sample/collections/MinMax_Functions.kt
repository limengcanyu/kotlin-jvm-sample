package com.kotlin.jvm.sample.collections

/**
 * <p>Description: min, max </p>
 *
 * min and max functions return the smallest and the largest element of a collection. If the collection is empty, they return null.
 *
 * @author Rock Jiang
 * @date 2019/5/14 0014
 * @version 1.0
 */
fun main() {

    val numbers = listOf(1, 2, 3)
    val empty = emptyList<Int>()

    println("Numbers: $numbers, min = ${numbers.min()} max = ${numbers.max()}") // 1
    println("Empty: $empty, min = ${empty.min()}, max = ${empty.max()}")        // 2
}

// 1. For non-empty collection functions return the smallest and the largest element.
// 2. For empty collections both functions return null.