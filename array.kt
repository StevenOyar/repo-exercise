fun main() {
    val max: Int = findMax(arrayOf(4, 6, 7, 8, 9, 3, 5, 6))
    val min: Int = findMin(arrayOf(4, 10, 34, 56, 22, 6, 99))
    println("max value = $max")
    println("min value = $min")

    //
    val max1: Int = findMaxAndMin(arrayOf(4, 10, 34, 56, 22, 6, 99), seachNumber = true)
    val min1: Int = findMaxAndMin(arrayOf(4, 10, 34, 56, 22, 6, 99), seachNumber = false)
    println("max :$max1")
    println("min: $min1")


}

fun findMax(numbers: Array<Int>): Int {
    var max: Int = numbers[0]

    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return max
}

fun findMin(numbers: Array<Int>): Int {
    var min: Int = numbers[0]

    for (number in numbers) {
        if (number < min) {
            min = number
        }
    }
    return min
}
//alternatively the solution on the same function
fun findMaxAndMin(numbers: Array<Int>, seachNumber: Boolean): Int {
    var max = numbers[0]
    var min = numbers[0]

    if (seachNumber) {
        for (number in numbers) {
            if (number > max) {
                max = number
            }
        }
        return max


    } else {
        for (number in numbers) {
            if (number < min) {
                min = number
            }

        }
        return min
    }

}
