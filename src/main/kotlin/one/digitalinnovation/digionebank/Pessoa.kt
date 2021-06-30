package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Brenda"
    var cpf: String = "162.162.162-62"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main () {
    val brenda = Pessoa()
    println(brenda.pessoaInfo())

}