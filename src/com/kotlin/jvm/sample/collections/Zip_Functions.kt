package com.kotlin.jvm.sample.collections

/**
 * <p>Description: zip </p>
 *
 * zip function merges two given collections into a new collection.
 * By default, the result collection contains Pairs of source collection elements with the same index.
 * However, you can define own structure of the result collection element.
 *
 * The size of the result collection equals to the minumum size of a source collection.
 *
 * @author Rock Jiang
 * @date 2019/5/14 0014
 * @version 1.0
 */
fun main() {

    val A = listOf("a", "b", "c")                  // 1
    val B = listOf(1, 2, 3, 4)                     // 1

    val resultPairs = A zip B                      // 2
    val resultReduce = A.zip(B) { a, b -> "$a$b" } // 3

    println("A to B: $resultPairs")
    println("\$A\$B: $resultReduce")
}

// 1. Defines two collections.
// 2. Merges them into a list of pairs. The infix notation is used here.
// 3. Merges them into a list of String values by the given transformation.