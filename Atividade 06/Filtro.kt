fun main() {
val Frutas = arrayListOf(
	Frutas("Banana", 5.00),
	Frutas("Morango", 2.0),
	Frutas("Acerola", 1.10),
	Frutas("Amora", 1.00),
	Frutas("Framboesa", 10.0),
	Frutas("Melancia", 5.6))
	val FrutasPromocao= Frutas.filter{ it.valor<= 2.0 }
	println(FrutasPromocao)}

data class Frutas(val nome: String, val valor: Double)
