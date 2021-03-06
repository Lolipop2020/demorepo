fun main(){
    val age = readLine()!!.toInt()
    if(age >= 1 && age <= 200){
        val lastDigit: Int = age % 10
        print(lastDigit)
        var ageStr = ""

        if ( age - lastDigit == 10 || age - lastDigit == 110) { // 10 - 19 лет, 110 - 119 лет
          ageStr = "лет"
        }else if (lastDigit == 8){
            ageStr = "лет"
        }else if (lastDigit == 1){
            ageStr = "год"
        }else if (lastDigit == 4){
            ageStr = "год"
        }else{
            ageStr = "лет"
        }
        print("Вывод: $age - $ageStr")
    }else{
        print("число не может быть больше 200 или меньше 1")
    }
}