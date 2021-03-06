fun main(){
    print("Введите четырехзначное число")
    val num = readLine()!!.toInt()
    val result: Boolean = num % 10 +num / 10 % 10 == num / 100 % 10 + num / 1000
     print(result)
}