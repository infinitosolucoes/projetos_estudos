fun main() {
    val frase = "Kotlin e uma linguagem"
    //variavel  mutavel.
    var nome: String = "Wellington"

    var liga: Boolean = false
    var salario: Float = 2950.0F
    //varival imutavel
    val idade: Int = 10
    var str1 = "Visitante"
    var str2 = "Ola ${str1.length}"
    println(str2)
    println(nome);
    println(idade);
    println(frase)
    val str3:String = """teste de testo grande
        dasdasdasdas
        dasdasdsadas
        dasdasdsadas
        dasdsadsa
    """.trimMargin()
    println(str3)

}