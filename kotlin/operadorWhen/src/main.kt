fun operacao(a: Int, b: Int, c: String) {
    /*
    when (c) {
        "Soma" -> {
            return a + b
        }
        "Subtração" -> {
            return a - b
        }
        "Divisao" -> {
            return a / b
        }
        "Multiplicação" -> {
            return a * b
        }
        else ->
        {
            println("operação invalida")
            return 0
        }
    }

    when {
        a > 0 && b > 0 -> {
            println("variaveis maiores que zero")
        }
    }
     */
    when (a) {
        in 1..99 -> {
            println("Século")
        }
    }
}

fun main() {
    println("Operador When")
    // println(operacao(10, 10, "Soma"))
    //println(operacao(20, 10, "Subtração"))
    println(operacao(30, 15, "Divisao"))
    //println(operacao(10, 10, "Multiplicação"))
}