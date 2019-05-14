package com.kotlin.jvm.sample.collections

/**
 * <p>Description: filter function </p>
 *
 * ilter function enables you to filter collections. It takes a filter predicate as a lambda-parameter.
 * The predicate is applied to each element. Elements that make the predicate true are returned in the result collection.
 *
 * @author Rock Jiang
 * @date 2019/5/14 0014
 * @version 1.0
 */
fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)      // 1

    val positives = numbers.filter { x -> x > 0 }  // 2

    val negatives = numbers.filter { it < 0 }      // 3

    println("Numbers: $numbers")
    println("Positive Numbers: $positives")
    println("Negative Numbers: $negatives")
}

// 1. Defines collection of numbers.
// 2. Gets positive numbers.
// 3. Uses the shorter it notation to get negative numbers.