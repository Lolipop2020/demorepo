fun main(){
    //val myArray = arrayof(1, 2, 3, 4, 5)


    //print(myArray[0])
    //print(myArray[1])


    val myArrayList = ArrayList<String>()

    myArrayList.add("Kotlin")
    myArrayList.add("Java")
    myArrayList.add("Dart")

    myArrayList.add(1,"python")

    myArrayList.removeAt(2)

    print(myArrayList)
    print(myArrayList.size)

}