interface Raca {
    val nome: String
    fun aplicarBonus(atributos: Atributos)
    fun calcularModificador(valorAtributo: Int): Int

    companion object {
        val racas = listOf(
            object : Raca {
                override val nome = "Anão da Montanha"
                override fun aplicarBonus(atributos: Atributos) {
                    atributos.força += 2
                    atributos.constituição += 2
                    println("Bônus de +2 Força e +2 Constituição aplicados para Anão da Montanha!")
                }

                override fun calcularModificador(valorAtributo: Int): Int {
                    return (valorAtributo - 10) / 2
                }
            },
            object : Raca {
                override val nome = "Humano"
                override fun aplicarBonus(atributos: Atributos) {
                    atributos.força += 1
                    atributos.destreza += 1
                    atributos.constituição += 1
                    atributos.inteligência += 1
                    atributos.sabedoria += 1
                    atributos.carisma += 1
                    println("Bônus de +1 em todos os atributos aplicados para Humano!")
                }

                override fun calcularModificador(valorAtributo: Int): Int {
                    return (valorAtributo - 10) / 2
                }
            },
            object : Raca {
                override val nome = "Draconato"
                override fun aplicarBonus(atributos: Atributos) {
                    atributos.força += 2
                    atributos.carisma += 1
                    println("Bônus de +2 Força e +1 Carisma aplicados para Draconato!")
                }

                override fun calcularModificador(valorAtributo: Int): Int {
                    return (valorAtributo - 8) / 2
                }
            },
            object : Raca {
                override val nome = "Meio-Orc"
                override fun aplicarBonus(atributos: Atributos) {
                    atributos.força += 2
                    atributos.constituição += 1
                    println("Bônus de +2 Força e +1 Constituição aplicados para Meio-Orc!")
                }

                override fun calcularModificador(valorAtributo: Int): Int {
                    return (valorAtributo - 10) / 2
                }
            },
            object : Raca {
                override val nome = "Elfo"
                override fun aplicarBonus(atributos: Atributos) {
                    atributos.destreza += 2
                    println("Bônus de +2 Destreza aplicados para Elfo!")
                }

                override fun calcularModificador(valorAtributo: Int): Int {
                    return (valorAtributo - 10) / 2
                }
            },
            object : Raca {
                override val nome = "Halfling"
                override fun aplicarBonus(atributos: Atributos) {
                    atributos.destreza += 2
                    println("Bônus de +2 Destreza aplicados para Halfling!")
                }

                override fun calcularModificador(valorAtributo: Int): Int {
                    return (valorAtributo - 10) / 2
                }
            },
            object : Raca {
                override val nome = "Gnomo da Floresta"
                override fun aplicarBonus(atributos: Atributos) {
                    atributos.destreza += 1
                    println("Bônus de +1 Destreza aplicados para Gnomo da Floresta!")
                }

                override fun calcularModificador(valorAtributo: Int): Int {
                    return (valorAtributo - 10) / 2
                }
            },
            object : Raca {
                override val nome = "Gnomo das Rochas"
                override fun aplicarBonus(atributos: Atributos) {
                    atributos.constituição += 1
                    println("Bônus de +1 Constituição aplicados para Gnomo das Rochas!")
                }

                override fun calcularModificador(valorAtributo: Int): Int {
                    return (valorAtributo - 10) / 2
                }
            },
            object : Raca {
                override val nome = "Alto Elfo"
                override fun aplicarBonus(atributos: Atributos) {
                    atributos.inteligência += 1
                    println("Bônus de +1 Inteligência aplicados para Alto Elfo!")
                }

                override fun calcularModificador(valorAtributo: Int): Int {
                    return (valorAtributo - 10) / 2
                }
            },
            object : Raca {
                override val nome = "Gnomo"
                override fun aplicarBonus(atributos: Atributos) {
                    atributos.inteligência += 2
                    println("Bônus de +2 Inteligência aplicados para Gnomo!")
                }

                override fun calcularModificador(valorAtributo: Int): Int {
                    return (valorAtributo - 10) / 2
                }
            },
            object : Raca {
                override val nome = "Tiefling"
                override fun aplicarBonus(atributos: Atributos) {
                    atributos.inteligência += 1
                    atributos.carisma += 2
                    println("Bônus de +1 Inteligência e +2 Carisma aplicados para Tiefling!")
                }

                override fun calcularModificador(valorAtributo: Int): Int {
                    return (valorAtributo - 10) / 2
                }
            },
            object : Raca {
                override val nome = "Anão da Colina"
                override fun aplicarBonus(atributos: Atributos) {
                    atributos.sabedoria += 1
                    println("Bônus de +1 Sabedoria aplicados para Anão da Colina!")
                }

                override fun calcularModificador(valorAtributo: Int): Int {
                    return (valorAtributo - 10) / 2
                }
            },
            object : Raca {
                override val nome = "Meio-Elfo"
                override fun aplicarBonus(atributos: Atributos) {
                    atributos.carisma += 2
                    println("Bônus de +2 Carisma aplicados para Meio-Elfo!")
                }

                override fun calcularModificador(valorAtributo: Int): Int {
                    return (valorAtributo - 10) / 2
                }
            },
            object : Raca {
                override val nome = "Drow"
                override fun aplicarBonus(atributos: Atributos) {
                    atributos.carisma += 1
                    println("Bônus de +1 Carisma aplicados para Drow!")
                }

                override fun calcularModificador(valorAtributo: Int): Int {
                    return (valorAtributo - 10) / 2
                }
            },
            object : Raca {
                override val nome = "Halfling Pés-Leves"
                override fun aplicarBonus(atributos: Atributos) {
                    atributos.carisma += 1
                    println("Bônus de +1 Carisma aplicados para Halfling Pés-Leves!")
                }

                override fun calcularModificador(valorAtributo: Int): Int {
                    return (valorAtributo - 10) / 2
                }
            }
        )
    }
}


