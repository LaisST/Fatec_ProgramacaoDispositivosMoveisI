fun main(){
	val soma = {x: Int, y: Int-> x + y }
	val subtrai = {x: Int, y: Int-> x - y }
	var x = 0
	var y = 0

	println("Digite o primeiro valor: ")
  x = readLine().toString().toInt()

	println("Digite o Segundo valor: ")
  y = readLine().toString().toInt()
	
	println("$x + $y = ${soma(x,y)}")
	println("$x - $y = ${subtrai(x,y)}")}
