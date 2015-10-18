package patternMatching

interface Expr
class Num(val value : Int) : Expr
class Sum(val left : Expr, val right : Expr) : Expr

fun eval(e : Expr) : Int {
    if (e is Num) {
        val n = e
        return n.value
    }

    else if (e is Sum)
        return eval(e.left) + eval(e.right)

    throw IllegalArgumentException("Unknown expression")
}

fun main(args : Array<String>) {

    println(eval(Sum(Num(1), Num(2))))
}
