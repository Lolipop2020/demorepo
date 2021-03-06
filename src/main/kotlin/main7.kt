package com.pro50.mobile

fun main(){
    var a = 2
    var message =
        when {
            a % 2 == 0 -> "a is even"
            a % 5 == 0 -> "a is not even and div by 5"
            else -> "xxxxxxx"
        }

    print(message)
}