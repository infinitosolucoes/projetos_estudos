fun main() {
     val str:String? = null
     println(str?.length)
   try {
       println(str!!.length)
   }
   catch (e: Exception){
       println(e.message)
   }


    val n1: Double = Double.MAX_VALUE

    try {
        println("teste".toInt())
    } catch (e: NumberFormatException) {
        println("Esse valor nao e numero")
    } catch (e: Exception) {
        println("Algo deu errado ${e.message}")
    } finally {
        println("teste finally")
    }
}