fun main( ) {
    var nota1: Double
    var nota2: Double
    var nota3: Double
    var nota4: Double
    var media: Double

    println("Digite a 1ªNota: ")
    nota1 = readLine().toString().toDouble()

    println("Digite a 2ªNota: ")
    nota2 = readLine().toString().toDouble()

    println("Digite a 3ªNota: ")
    nota3 = readLine().toString().toDouble()

    println("Digite a 4ªNota: ")
    nota4 = readLine().toString().toDouble()

    media = (nota1 + nota2 + nota3 + nota4) / 4

    println("Sua média é $media")

    if (media >= 7) {
        println("Parabéns! Você está aprovado")
    } else {
        println("Você está reprovado!")
    }
}
