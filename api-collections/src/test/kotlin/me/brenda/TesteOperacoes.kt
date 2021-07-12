package me.brenda

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("--------------------------------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salárial: ${salarios.average()}"   )

    val salariosMaiorque2500 = salarios.filter { it > 2500.0 }
    println("--------------------------------")
    salariosMaiorque2500.forEach { println(it)}

    println("--------------------------------")
    println(salarios.count{it in 2000.0..5000.0})

    println("--------------------------------")
    println(salarios.find{it == 2250.0})
    println(salarios.find{it == 500.0})

    println("--------------------------------")
    println(salarios.any{ it == 1000.0})


}