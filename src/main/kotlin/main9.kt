fun main(){

    val names:ArrayList<String> = arrayListOf("Kotlin", "Java", "Dart")

    for(i :Int in 0 until names.size){
        println(names[i])
    }

    for(i :Int in 0..10){
        if(i == 6) break
      println(i)
    }

    println("_____________________________")


    var j = 11

   while (j <= 10){
       println(j)
       j++
   }

    println("_____________________________")


    var k = 11

    do{
        println(k)
        k++
    }while (k<= 10)



}