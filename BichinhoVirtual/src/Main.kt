fun main() {
    println("🐾 Bem-vindo ao Simulador de Animal Virtual!")
    print("Digite o nome do seu animal de estimação: ")

    val nomePet = readln()
    val pet = BichoVirtual(nomePet)

    while (!pet.perdeu) {
        println(
            """
            
            O que você deseja fazer com ${pet.nome}?
            1. Alimentar 🍖
            2. Brincar 🎾
            3. Descansar 😴
            4. Ir ao banheiro 🚽
            5. Tomar banho 🧼
            6. Verificar status 📊
            7. Sair 🚪
            """.trimIndent()
        )

        print("Escolha uma opção: ")
        val escolha = readLine()?.toIntOrNull() ?: continue

        when (escolha) {
            1 -> pet.alimentar()
            2 -> pet.brincar()
            3 -> {
                print("Quantas horas ${pet.nome} vai descansar? ")
                val horas = readLine()?.toIntOrNull() ?: 0
                pet.descansar(horas)
            }
            4 -> pet.irAoBanheiro()
            5 -> pet.tomarBanho()
            6 -> pet.verificarStatus()
            7 -> {
                println("👋 Saindo do jogo. Até logo!")
                return
            }
            else -> println("Opção inválida, tente novamente.")
        }

        pet.passarTempo()
    }
}
