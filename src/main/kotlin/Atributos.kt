class Atributos(
    var força: Int = 8,
    var destreza: Int = 8,
    var constituição: Int = 8,
    var inteligência: Int = 8,
    var sabedoria: Int = 8,
    var carisma: Int = 8
) {

    fun exibirAtributos() {
        println("Força: $força")
        println("Destreza: $destreza")
        println("Constituição: $constituição")
        println("Inteligência: $inteligência")
        println("Sabedoria: $sabedoria")
        println("Carisma: $carisma")
    }
}
