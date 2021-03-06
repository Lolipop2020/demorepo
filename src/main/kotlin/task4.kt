import kotlin.math.sqrt

fun main(){
    print("Введите a:")
    var a = readLine()!!.toDouble()
    print("Введите b:")
    var b = readLine()!!.toDouble()
    print("Введите c:")
    var c = readLine()!!.toDouble()
    var d = b * b - 4 * a * c

    print("x1 = ${(-b - sqrt(d)) / (2 * a)}")
    print("x2 = ${(-b + sqrt(d)) / (2 * a)}")
}
