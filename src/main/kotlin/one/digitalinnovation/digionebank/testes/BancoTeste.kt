package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco(none = "DigiOne", numero = 12 )

    println(digiOneBank.none)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(none = "Banco2")

    println(banco2.info())
}