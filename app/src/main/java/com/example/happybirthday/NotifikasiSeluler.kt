package com.example.happybirthday

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    // Fill in the code.
    if (numberOfMessages > 99) {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
    else{
        println("You have 51 notifications")
    }
}