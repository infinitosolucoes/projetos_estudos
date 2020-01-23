fun calculaBonus(cargo: String, salario: Float): Float {
     return if (cargo == "Coordenador") {
         salario * 0.2f
    } else if (cargo == "Gerente Junior") {
        salario * 0.5f
    } else {
        salario * 2
    }

}

fun hello(nome: String): String {
    return "Ola, $nome"
}

fun maiorIdade2(idade: Int): Boolean {
    return idade >= 18
}

fun maiorIdade(idade: Int) {
    if (idade >= 18) {
        println("E Maior de idade")
    } else {
        println("Nao e Maior de idade")
    }
}

//funcao em unica linha
fun hello2(nome: String) = "Ola, $nome"

fun main() {
    println("Funções no kotlin")
    //operador elvis
    val test: Int? = null
    val op = test ?:100
    println(op)
    println(calculaBonus("Coordenador", 1500f))
    println(calculaBonus("Gerente Junior", 1600f))
    println(calculaBonus("Gerente Senior", 1500f))

}