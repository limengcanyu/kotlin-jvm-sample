package com.kotlin.jvm.sample.productivityBoosters

/**
 * <p>Description: Named Arguments </p>
 *
 * As with most other programming languages (Java, C++, etc.),
 * Kotlin supports passing arguments to methods and constructors according to the order they are defined.
 * Kotlin also supports named arguments to allow clearer invocations and avoid mistakes with the order of arguments.
 * Such mistakes are hard to find because they are not detected by the compiler, for example, when two sequential arguments have the same type.
 *
 * @author Rock Jiang
 * @date 2019/5/14 0014
 * @version 1.0
 */
fun format(userName: String, domain: String) = "$userName@$domain"

fun main() {
    println(format("mario", "example.com"))                         // 1
    println(format("domain.com", "username"))                       // 2
    println(format(userName = "foo", domain = "bar.com"))           // 3
    println(format(domain = "frog.com", userName = "pepe"))         // 4
}

// 1. Calls a function with argument values.
// 2. Calls a function with switched arguments. No syntax errors, but the result domain.com@username is incorrect.
// 3. Calls a function with named arguments.
// 4. When invoking a function with named arguments, you can specify them in any order you like.