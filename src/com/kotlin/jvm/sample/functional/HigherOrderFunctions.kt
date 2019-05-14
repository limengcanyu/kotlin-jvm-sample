package com.kotlin.jvm.sample.functional

/**
 * <p>Description: Higher-Order Functions </p>
 *
 * A higher-order function is a function that takes another function as parameter and/or returns a function.
 *
 * @author Rock Jiang
 * @date 2019/5/14 0014
 * @version 1.0
 */

/**
 * <p>Description: Taking Functions as Parameters </p>
 *
 */
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // 1
    return operation(x, y)                                          // 2
}

fun sum(x: Int, y: Int) = x + y                                     // 3

fun main() {
    val sumResult = calculate(4, 5, ::sum)                     // 4
    val mulResult = calculate(4, 5) { a, b -> a * b }          // 5
    println("sumResult $sumResult, mulResult $mulResult")
}

// 1. Declares a higher-order function. It takes two integer parameters, x and y.
//    Additionally, it takes another function operation as a parameter.
//    The operation parameters and return type are also defined in the declaration.
// 2. The higher order function returns the result of operation invocation with the supplied agruments.
// 3. Declares a function that matches the operationsignature.
// 4. Invokes the higher-order function passing in two integer values and the function argument ::sum.
//    :: is the notation that references a function by name in Kotlin.
// 5. Invokes the higher-order function passing in a lambda as a function argument. Looks clearer, doesn't it?

/**
 * <p>Description: Returning Functions </p>
 *
 */
//fun operation(): (Int) -> Int {                                     // 1
//    return ::square
//}
//
//fun square(x: Int) = x * x                                          // 2
//
//fun main() {
//    val func = operation()                                          // 3
//    println(func(2))                                                // 4
//}

// 1. Declares a higher-order function that returns a function.
// 2. Declares a function matching the signature.
// 3. Invokes operation to get the result assigned to a variable. Here func becomes square which is returned by operation.
// 4. Invokes func. The square function is actually executed.