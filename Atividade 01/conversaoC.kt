fun conversaoC(){
  var c: Double
  var f: Double

  println("Digite a temperatura em graus Celsius")
  c = readLine().toString().toDouble()
  f = (9 * c + 160) /5

  println("$c º Celsius é igual a $f º Fahrenheit")
}