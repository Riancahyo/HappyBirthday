package com.example.happybirthday

fun main() {
    val brian = Person("Brian", 20, "Badminton", null)
    val atiqah = Person("Atiqah", 28, "climb", brian)

    brian.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Nama: $name")
        println("age: $age")

        if (hobby != null) {
            println("Hobby: $hobby")
        }

        if (referrer != null) {
            println("Has a referrer name ${referrer.name}, who likes to ${referrer.hobby}.")
        } else {
            println("Doesn't have a referrer.")
        }
    }
}