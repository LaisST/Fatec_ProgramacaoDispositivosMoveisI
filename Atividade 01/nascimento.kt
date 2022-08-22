fun nascimento() {
  var dia : Int
  var mes : Int
  var ano : Int
  var idade: Int
  var resultado : Int
  
  println("Digite o dia que você nasceu ")
  dia = readLine().toString().toInt()

  println("Digite o mês que você nasceu ")
  mes = readLine().toString().toInt()

  println("Digite o ano que você nasceu ")
  ano = readLine().toString().toInt()
println("Sua data de nascimento é $dia/$mes/$ano")

  if(mes<=8){
  idade = 2022-ano
  resultado = idade * 365
  resultado = ((8-mes)*30)+resultado
  println("São aproximadamente $resultado dias")

  
  }else if(mes > 8){
  idade = 2021-ano
  resultado = idade * 365
  resultado = (((12-mes)+8)*30)+resultado
  println("São aproximadamente $resultado dias")
  }
  
}