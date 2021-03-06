fun main (){

    val score = 60




    when(score) {
        in 90 ..100 -> print("5")
        in  70 .. 89 -> print("4")
        in 50 ..69 -> print("3")
        in 30 ..49 -> print("2")
        in 0 ..29 -> print("1")
        else -> print("invalid score")
    }

    when{
        3>2 -> print("3>2")
        "string". length == 6 -> print("length is 6")
        2>3 -> print("2>3")
        else ->{
            print("else called")
        }
    }


val  a = 5
val b = 3

val maxValue = when (a>b) {
    true -> a
    false -> b
}





  print("maxvalue : $maxValue")
}