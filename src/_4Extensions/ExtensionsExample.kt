package _4Extensions.extensions

fun String.lastChar() = this.get(this.length - 1)

//'this' can be omitted
fun String.lastChar1() = get(length - 1)

fun test() {
    //visible in completion
    val c: Char = "abc".lastChar()
}
