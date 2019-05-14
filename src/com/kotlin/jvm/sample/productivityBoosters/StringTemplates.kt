package com.kotlin.jvm.sample.productivityBoosters

/**
 * <p>Description: String Templates </p>
 *
 * String templates allow you to include variable references and expressions into strings.
 * When the value of a string is requested (for example, by println), all references and expressions are substituted with actual values.
 *
 * @author Rock Jiang
 * @date 2019/5/14 0014
 * @version 1.0
 */
fun main() {
    val greeting = "Kotliner"

    println("Hello $greeting")                  // 1
    println("Hello ${greeting.toUpperCase()}")  // 2
}

// 1. Prints a string with a variable reference. References in strings start with $.
// 2. Prints a string with an expression. Expressions start with $ and are enclosed in curly braces.