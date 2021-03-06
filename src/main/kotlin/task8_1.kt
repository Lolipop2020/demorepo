fun main(){
    print("Массив:" )
    val mas1 = intArrayOf(5, -3, 15, 61, 29, 10, -2, 7)
    for (i in 0..mas1.size - 1) {
        print(mas1[i].toString() + "  ")
    }
    var max1 = mas1[0]
    for (i in 1 until mas1.size) {
        if (mas1[i] > max1) {
            max1 = mas1[i]
        }
    }
    println()
    print("Максимальное значение в массиве: $max1")
}