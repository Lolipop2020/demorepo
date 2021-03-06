fun main(){
    val password = "12345"
    val username = "onepunchman_01"
    val name = "John"



    val myMap = hashMapOf<String,String>()

    myMap.put("password", "12345")
    myMap.put("username", "onepunchman_01")
    myMap.put("name ", "John")

    myMap.remove("name")


    print(myMap.entries)

    print(myMap.get("password"))


    //set

    val mySet = HashSet<Int>()

    val list :ArrayList<Int> = arrayListOf(1,2,3,4,4,4,4,1,1)

    mySet.addAll(list)

    print(mySet)
}