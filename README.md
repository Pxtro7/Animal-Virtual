# 🐾 Bichinho Virtual 

Um projeto simples e divertido de **bichinho virtual (Tamagotchi)** feito em **Kotlin**, onde o jogador deve cuidar de seu pet alimentando, brincando, dando banho e muito mais!  
O objetivo é fazer o bichinho **viver até os 50 anos** sem deixá-lo morrer de fome, cansaço, sujeira ou tristeza.

---

## 🎮 Funcionalidades

- 🧍‍♂️ Criação de um bichinho com nome escolhido pelo jogador  
- 🍖 **Alimentar:** diminui a fome e aumenta a vontade de ir ao banheiro  
- 🎾 **Brincar:** aumenta a felicidade, mas também o cansaço e a sujeira  
- 😴 **Descansar:** reduz o cansaço  
- 🚽 **Ir ao banheiro:** alivia a vontade de ir ao banheiro  
- 🧼 **Tomar banho:** remove a sujeira  
- 📊 **Ver status:** mostra todos os atributos do bichinho  
- ⏳ **Passagem de tempo:** a cada ação, a idade aumenta e os níveis mudam automaticamente  
- 💀 Condições de derrota e 🎉 vitória (quando o bichinho chega aos 50 anos)

---

## ⚙️ Atributos do Bichinho

| Atributo | Varia com | Efeito |
|-----------|------------|--------|
| **Fome** | Passagem de tempo, brincar | Morre se chegar a 100 |
| **Felicidade** | Brincar aumenta, tempo reduz | Morre se chegar a 0 |
| **Cansaço** | Brincar aumenta, descansar reduz | Morre se chegar a 100 |
| **Idade** | Passagem de tempo | Vitória se chegar a 50 |
| **Vontade de ir ao banheiro** | Alimentar aumenta | Morre se chegar a 100 |
| **Sujeira** | Brincar e banheiro aumentam | Morre se chegar a 100 |




