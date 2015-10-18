package _4Extensions.extensions

fun String.lastChar() = this.charAt(this.length() - 1)
//'this' can be omitted
fun String.lastChar1() = charAt(length() - 1)

fun test() {
    //visible in completion
    "abc".lastChar()
}
