package _3DefaultAndNamedArgs

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(list)
    println(list.joinToString(separator = ", ", postfix = "."))
}

