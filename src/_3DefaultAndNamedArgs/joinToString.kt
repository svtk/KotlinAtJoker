package _3DefaultAndNamedArgs.joinToString

interface List<T> {

    fun joinToString(
            separator: String = ", ",
            prefix: String = "",
            postfix: String = "",
            limit: Int = -1,
            truncated: String = "...",
            transform: ((T) -> String)? = null
    ): String
}