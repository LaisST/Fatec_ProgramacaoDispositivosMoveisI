fun conversaoF() {
  var c: Double
  var f: Double

  println("Digite a temperatura em graus Fahrenheit ")
  f = readLine().toString().toDouble()
  c = (f-32)/1.8
  println("$f º Fahrenheit é igual a $c º Celsius")
}