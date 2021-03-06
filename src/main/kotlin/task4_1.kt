fun main(args: Array<String>){
    var first = 5
    var second = 10
    print("--Before swap--")
    print("First number = $first")
    print("Second number = $second")

    val temporary = first
    first = second
    second = temporary
    print("--After swap--")
    print("First number = $first")
    print("Second number = $second")
}