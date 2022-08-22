fun cotacao() {
  var cotacao : Double
  var dolar: Double
  var real : Double

  println("Digite o valor da cotação em dólar: ")
  cotacao = readLine().toString().toDouble()

  println("Digite o valor em dólar que deseja converter: ")
  dolar = readLine().toString().toDouble()
  
  real = dolar * cotacao

  println("$ $dolar dolares = R$ $real reais no câmbio de $ $cotacao") 
}