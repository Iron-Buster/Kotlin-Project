fun f() {
    return println("Hello, world!")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun sumX(x: Int, y: Int) = x + y

fun printMessageWithPrefix(msg: String, prefix: String) {
    println("[$prefix] $msg")
}

// 方法参数的默认值
fun defaultParameterValues(msg: String, prefix: String = "Info") {
    println("[$prefix] $msg")
}

// lambda expressions
// 普通的函数
fun upperCaseString(text: String): String {
    return text.uppercase()
}
// lambada 表达式
// val upperCaseStringLambda = { text: String -> text.uppercase() }

fun main() {
    f()
    println(sum(1, 2))
    printMessageWithPrefix(prefix = "Log", msg = "Hello")

    defaultParameterValues(msg = "Tom")

    println(sumX(1, 2))


    val upperCaseStringLambda = { text: String -> text.uppercase() }
    println(upperCaseStringLambda("hello"))


    // Pass to another function
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter({ x -> x > 0})

    val isNegative = { x: Int -> x < 0 }
    val negatives = numbers.filter(isNegative)

    println(positives)
    println(negatives)

    // .map()
    val doubled = numbers.map { x -> x * 2 }

    val isTripled = { x: Int -> x * 3 }
    val tripled = numbers.map(isTripled)
    println(doubled)
    println(tripled)
}
