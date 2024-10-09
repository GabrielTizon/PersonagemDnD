import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AtributosTest {

    @Test
    fun `modificador constituicao anao correto`() {
        val atributos = Atributos(constituição = 16)
        val raca = Raca.racas.find { it.nome == "Anão da Montanha" }!!

        val modificadorConstituicao = raca.calcularModificador(atributos.constituição)

        // Constituição 16 deve ser +3
        assertEquals(3, modificadorConstituicao)
    }
}