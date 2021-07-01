package one.digitalinnovation.digionebank

abstract class Funcionario(
   none: String,
    cpf: String,
    val salario: Double
) : Pessoa(none , cpf) {
   protected abstract fun  calculoAuxilio(): Double

   override fun toString(): String = """""
    Nome: $none
    Cpf: $cpf
    Salario: $salario 
    Auxilio: ${calculoAuxilio()}
""".trimIndent()
}