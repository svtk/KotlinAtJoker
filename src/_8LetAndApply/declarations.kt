package _8LetAndApply.declarations


inline fun <T, R> T.let(f: (T) -> R): R = f(this)


inline fun <T> T.apply(f: T.() -> Unit): T { f(); return this }

