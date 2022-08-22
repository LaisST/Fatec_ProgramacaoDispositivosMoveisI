fun main() {
  var raio : Double
  var area: Double

  println("Digite o raio da circunferência: ")
  raio = readLine().toString().toDouble()

  area = 3.14 * (raio*raio)
  println("A área da circunferência é $area cm²") 
}