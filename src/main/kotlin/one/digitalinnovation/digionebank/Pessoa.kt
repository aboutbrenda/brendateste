package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Brenda"
    var cpf: String = "162.162.162-62"
}

fun main () {
    val brenda = Pessoa()

    println(brenda.nome)
    println(brenda.cpf)
}