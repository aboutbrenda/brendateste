package me.brenda

fun main() {
    val nomes = Array(size = 3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Zayn"
    nomes[2] = "José"

    for(nome in nomes) {
        println(nome)
    }

    println("------------------------")
    nomes.sort()
    nomes.forEach { println(it) }



    println("------------------------")

    val nomes2 = arrayOf("maria", "Zayn", "Pedro")

    nomes.sort()
    nomes.forEach { println(it) }
}