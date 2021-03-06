fun main(){
    val num = readLine()!!.toInt()
    var str: String = ""
    when(num){
        1 -> str = "31"
        2 -> str = "28"
        3 -> str = "31"
        4 -> str = "30"
        5 -> str = "31"
        6 -> str = "30"
        7 -> str = "31"
        8 -> str = "31"
        9 -> str = "30"
        10 -> str = "31"
        11 -> str = "30"
        12 -> str = "31"
        else -> str ="несуществующий месяц"
    }
    print("Месяц $num - дней $str")
}