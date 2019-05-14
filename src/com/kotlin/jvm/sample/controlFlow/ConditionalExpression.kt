package com.kotlin.jvm.sample.controlFlow

/**
 * <p>Description: Conditional Expression </p>
 *
 * There is no ternary operator condition ? then : else in Kotlin. Instead, if may be used as an expression:
 *
 * @author Rock Jiang
 * @date 2019/5/14 0014
 * @version 1.0
 */
fun main() {
    fun max(a: Int, b: Int) = if (a > b) a else b         // 1

    println(max(99, -42))
}

// 1. if is an expression here: it returns a value.