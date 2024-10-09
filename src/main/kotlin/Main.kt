fun main() {
    println("Bem-vindo ao sistema de criação de personagens!")

    // Escolha do nome do personagem
    println("Escolha o nome do seu personagem:")
    val nomePersonagem = readLine().orEmpty()
    println("Você escolheu o nome: $nomePersonagem")


    println("Escolha uma raça para o seu personagem:")
    Raca.racas.forEachIndexed { index, raca -> println("${index + 1}. ${raca.nome}") }

    val escolhaRaca = readLine()?.toIntOrNull() ?: 1
    val racaEscolhida = Raca.racas.getOrNull(escolhaRaca - 1) ?: Raca.racas[0]

    println("Você escolheu: ${racaEscolhida.nome}")
    val atributos = Atributos()
    racaEscolhida.aplicarBonus(atributos)


    val totalPontos = 27
    var pontosRestantes = totalPontos
    println("\nVocê tem $totalPontos pontos para distribuir entre os seguintes atributos:")
    atributos.exibirAtributos()

    val atributosNomes = listOf("Força", "Destreza", "Constituição", "Inteligência", "Sabedoria", "Carisma")
    val atributosValores = mutableListOf(atributos.força, atributos.destreza, atributos.constituição, atributos.inteligência, atributos.sabedoria, atributos.carisma)

    for (i in atributosNomes.indices) {
        println("\nQuantos pontos você deseja alocar para ${atributosNomes[i]}? (Pontos restantes: $pontosRestantes)")
        val pontos = readLine()?.toIntOrNull() ?: 0

        if (pontos in 0..pontosRestantes) {
            atributosValores[i] = pontos
            pontosRestantes -= pontos
        } else {
            println("Pontos inválidos. Tente novamente.")
        }
    }

    // Atualiza os valores dos atributos na instância da classe
    atributos.força = atributosValores[0]
    atributos.destreza = atributosValores[1]
    atributos.constituição = atributosValores[2]
    atributos.inteligência = atributosValores[3]
    atributos.sabedoria = atributosValores[4]
    atributos.carisma = atributosValores[5]


    val modificadorConstituicao = racaEscolhida.calcularModificador(atributos.constituição)
    println("\nDistribuição final dos atributos para o personagem $nomePersonagem:")
    atributos.exibirAtributos()
    println("Modificador de Constituição: $modificadorConstituicao")

    println("\nPersonagem criado com sucesso!")
}

