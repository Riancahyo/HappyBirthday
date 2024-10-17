package com.example.happybirthday

fun main () {
    val foldablePhone = FoldablePhone()
    foldablePhone.checkPhoneScreenLight()
    foldablePhone.unfold()
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()
    foldablePhone.fold()
    foldablePhone.switchOn()
}

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone (var isFolded: Boolean = false) : Phone() {
    override fun switchOn() {
        if (!isFolded)  {
            isScreenLightOn = true
            println("The foldable phone is unfolded and the screen's light is on.")
        } else {
            println("Can't switch on, the phone is folded.")
        }
    }

    fun fold() {
        isFolded = true
        println("The phone is now folded")
    }

    fun unfold() {
        isFolded = false
        println("The phone is now unfolded.")
    }
}