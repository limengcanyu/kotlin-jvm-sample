package com.kotlin.jvm.sample.introduction

// 1

/**
 * <p>Description: Hello World </p>
 *
 * @author Rock Jiang
 * @date 2019/5/13 0013
 * @version 1.0
 */
fun main() {                        // 2
    println("Hello, World!")        // 3
}

// 1. Kotlin code is usually defined in packages. Package specification is optional:
//    If you don't specify a package in a source file, its content goes to the default package.
// 2. An entry point to a Kotlin application is the main function. In Kotlin 1.3, you can declare main without any parameters.
//    The return type is not specified, which means that the function returns nothing.
// 3. println writes a line to the standard output. It is imported implicitly. Also note that semicolons are optional.

/**
 * In Kotlin versions earlier than 1.3, the main function must have a parameter of type Array<String>.
 *
 */
//fun main(args: Array<String>) {
//    println("Hello, World!")
//}