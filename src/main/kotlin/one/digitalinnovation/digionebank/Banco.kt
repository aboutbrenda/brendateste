package one.digitalinnovation.digionebank

data class Banco(
    val none: String,
    val numero: Int
) {
    fun info() = "$none - $numero"
}