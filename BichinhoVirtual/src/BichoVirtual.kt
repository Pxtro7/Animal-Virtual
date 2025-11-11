class BichoVirtual(var nome: String) {

    var nivelDeFome = 50
    var nivelFelicidade = 50
    var nivelCansaco = 0
    var idade = 0
    var vontadeBanheiro = 0
    var sujeira = 0
    var perdeu = false

    fun alimentar() {
        nivelDeFome = (nivelDeFome - 15).coerceAtLeast(0)
        vontadeBanheiro = (vontadeBanheiro + 20).coerceAtMost(100)
        println("$nome foi alimentado e está satisfeito!")
    }

    fun brincar() {
        nivelFelicidade = (nivelFelicidade + 15).coerceAtMost(100)
        nivelCansaco = (nivelCansaco + 10).coerceAtMost(100)
        sujeira = (sujeira + 15).coerceAtMost(100)
        println("$nome brincou e se divertiu muito!")
    }

    fun descansar(horas: Int) {
        val reducao = horas * 10
        nivelCansaco = (nivelCansaco - reducao).coerceAtLeast(0)
        println("$nome descansou por $horas horas e recuperou energia.")
    }

    fun irAoBanheiro() {
        if (vontadeBanheiro > 0) {
            println("$nome foi ao banheiro. Que alívio! 💩")
            vontadeBanheiro = 0
            sujeira = (sujeira + 10).coerceAtMost(100)
        } else {
            println("$nome não está com vontade agora.")
        }
    }

    fun tomarBanho() {
        if (sujeira > 0) {
            sujeira = 0
            println("$nome tomou um banho e está limpinho! 🧼")
        } else {
            println("$nome já está limpo.")
        }
    }

    fun verificarStatus() {
        println("\n📊 Status atual de $nome:")
        println("Idade: $idade anos")
        println("Nível de fome: $nivelDeFome")
        println("Nível de felicidade: $nivelFelicidade")
        println("Nível de cansaço: $nivelCansaco")
        println("Vontade de ir ao banheiro: $vontadeBanheiro")
        println("Sujeira: $sujeira")
    }

    fun passarTempo() {
        idade++
        nivelDeFome = (nivelDeFome + 5).coerceAtMost(100)
        nivelFelicidade = (nivelFelicidade - 3).coerceAtLeast(0)
        nivelCansaco = (nivelCansaco + 2).coerceAtMost(100)
        sujeira = (sujeira + 1).coerceAtMost(100)

        // Condições de derrota
        if (nivelDeFome >= 100) {
            println("💀 $nome morreu de fome...")
            perdeu = true
        } else if (nivelFelicidade <= 0) {
            println("💀 $nome ficou muito triste e não resistiu...")
            perdeu = true
        } else if (nivelCansaco >= 100) {
            println("💀 $nome morreu de cansaço...")
            perdeu = true
        } else if (vontadeBanheiro >= 100) {
            println("💀 $nome não conseguiu segurar e passou mal... 😢")
            perdeu = true
        } else if (sujeira >= 100) {
            println("💀 $nome ficou doente de tanta sujeira...")
            perdeu = true
        } else if (idade >= 50) {
            println("🎉 Parabéns! $nome viveu até os 50 anos! Você venceu!")
            perdeu = true
        }
    }
}
