import kotlin.math.*
fun main(){
    print("Введите параметры  окружности")
    val x = readLine()!!.toDouble()
    val y = readLine()!!.toDouble()
    val r = readLine()!!.toDouble()
    val h = readLine()!!.toDouble()
    when{
        h>r -> print("точка находится за пределами круга")
        h<r -> print("точка пренадлежит кругу")
    }
}