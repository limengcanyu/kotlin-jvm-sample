package com.kotlin.jvm.sample.controlFlow

/**
 * <p>Description: Ranges </p>
 *
 * @author Rock Jiang
 * @date 2019/5/14 0014
 * @version 1.0
 */

/**
 * There is a set of tools for defining ranges in Kotlin. Let's have a brief look at them.
 *
 */
fun main() {
    for(i in 0..3) {             // 1
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2) {      // 2
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {      // 3
        print(i)
    }
    print(" ")

}

// 1. Iterates over a range starting from 0 up to 3 (inclusive).
// 2. Iterates over a range with a custom increment step for consecutive elements.
// 3. Iterates over a range in reverse order.

/**
 * Char ranges are also supported:
 *
 */
//fun main() {
//    for (c in 'a'..'d') {        // 1
//        print(c)
//    }
//    print(" ")
//
//    for (c in 'z' downTo 's' step 2) { // 2
//        print(c)
//    }
//    print(" ")
//
//}

// 1. Iterates over a char range in alphabetical order.
// 2. Char ranges support step and downTo as well.

/**
 * Ranges are also useful in if statements:
 *
 */
//fun main() {
//    val x = 2
//    if (x in 1..10) {            // 1
//        print(x)
//    }
//    print(" ")
//
//    if (x !in 1..4) {            // 2
//        print(x)
//    }
//}

// 1. Checks if a value is in the range.
// 2. !in is the opposite of in.