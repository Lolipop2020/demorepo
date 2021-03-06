fun main(){
    var number = readLine()!!.toInt()
    var numberOtver= number
    var count: Int
    if(number == 0)
        count=1
    else
        count=0
    while (number != 0) {
        count++
        number /= 10
    }
    print("число $numberOtver содержит $count цифр(у,ы")
}