package _8LetAndApply

import _1Classes.Person
import java.util.*

fun getPerson(): Person? = Person("Вася", 24)

fun main(args: Array<String>) {

    val list = ArrayList<Person>()

    val person: Person? = getPerson()
    person?.let { list.add(it) }

    list.apply {
        this.add(Person("Вася", 24))
        add(Person("Петя", 21))
    }

    StringBuilder().apply {
        for (element in list) {
            appendln(element)
        }
    }
}