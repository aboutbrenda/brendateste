package me.brenda

fun main() {
    val salarios = DoubleArray(size = 3)
        salarios[0] = 1000.0
        salarios[1] = 3000.0
        salarios[2] = 500.0

    salarios.forEach { println(it) }


    println("--------------------------------")
    salarios.forEachIndexed {index, salario ->
        salarios[index]= salario* 1.1
    }
    salarios.forEach { println(it) }


    println("--------------------------------")
    val salarios2 = doubleArrayOf(1500.0,1200.0,500.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
}
