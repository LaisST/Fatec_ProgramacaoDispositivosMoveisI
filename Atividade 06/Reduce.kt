data class Frutas (val nome: String, val valor: Double)

fun main() {
	val comprasFeira= listOf(
	Frutas("Banana", 5.00),
	Frutas("Morango", 2.0),
	Frutas("Acerola", 1.10),
	Frutas("Amora", 1.00),
	Frutas("Framboesa", 10.0),
	Frutas("Melancia", 5.6)
	)
	val totalizar = {total: Double, atual: Double -> total + atual}
	val precoTotal= comprasFeira.map{it.valor}.reduce(totalizar)
	println("O total é R$ $precoTotal")}
