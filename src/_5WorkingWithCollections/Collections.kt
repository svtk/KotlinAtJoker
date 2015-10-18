package _5WorkingWithCollections

import _1Classes.Person

fun main(args: Array<String>) {

    val persons = listOf(Person("Вася", 24), Person("Петя", 21))

    persons.filter { p: Person -> p.age > 21 }
}