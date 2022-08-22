fun prestacao() {
  var valor : Double
  var tempo: Int
  var taxa : Double
  var prestacao : Double

  println("Digite o valor: ")
  valor = readLine().toString().toDouble()

  println("Digite a quantidade de meses em atraso: ")
  tempo = readLine().toString().toInt()
  
  println("Digite o taxa: ")
  taxa = readLine().toString().toDouble()

  prestacao = valor + (valor*(taxa/100)*tempo)

  println("O valor da prestação em atraso é R$ $prestacao") 
}