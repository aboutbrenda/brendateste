package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario(
   none: String,
    cpf: String,
    val salario: BigDecimal
) : Pessoa(none , cpf) {
    abstract fun  calculoAuxilio ():
}