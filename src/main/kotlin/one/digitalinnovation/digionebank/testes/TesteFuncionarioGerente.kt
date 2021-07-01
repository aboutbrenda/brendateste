package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main () {
    val maria = Gerente("Maria do Carmo","162.162.162-62", 5000.0, "123")
ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)
}
