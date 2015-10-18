package _4Extensions

fun <T> Iterable<T>.joinToString(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = "",
        limit: Int = -1,
        truncated: String = "...",
        transform: ((T) -> String)? = null
): String {

    return joinTo(StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
}