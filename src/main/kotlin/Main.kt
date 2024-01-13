fun operation(): (Int) -> Int {
    return ::square
}

fun square(x: Int) = x * x

fun main() {
    val func = operation()
    println("O valor da operação é de ${func(4)}")
}