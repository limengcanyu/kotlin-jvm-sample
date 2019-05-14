package com.kotlin.jvm.sample.controlFlow

/**
 * <p>Description: Equality Checks </p>
 *
 * Kotlin uses == for structural comparison and === for referential comparison.
 * More precisely, a == b compiles down to a == null ? b == null : a.equals(b).
 *
 * @author Rock Jiang
 * @date 2019/5/14 0014
 * @version 1.0
 */
fun main(args: Array<String>) {

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)   // 1
    println(authors === writers)  // 2
}

// 1. Returns true because it calls authors.equals(writers) and sets ignore element order.
// 2. Returns false because authors and writers are distinct references.