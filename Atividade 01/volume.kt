fun volume() {
  var altura : Double
  var raio : Double
  var volume : Double
  
  println("Digite a altura da lata de óleo: ")
  altura = readLine().toString().toDouble()

  println("Digite o raio da lata de óleo: ")
  raio = readLine().toString().toDouble()

  volume = 3.1 * (raio*raio) * altura

  println("O volume da lata de óleo é $volume Cm²")

}