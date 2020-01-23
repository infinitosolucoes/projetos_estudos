fun media(vararg notas:Float){
    var soma = 0f
    for(nota in notas){
        soma += nota
    }
    println("A media e ${soma/notas.size}")
}
fun <T>media2(vararg valores: T ){
    for(valor in valores){
        println(valor)
    }
}
fun endereco(rua:String ="",cidade:String,estado:String,CEP:String,numero: Int =0 ){
println("endereco")
}
fun main(){
    media(10f,9f,5f)
    val str = "wellington"
    str.capitalize()
    str.decapitalize()
    str.contains("w")
    str.startsWith("l")
    arrayOf(1,2,3,4,5,6)

    var index = 0
    while (index <=100){
        println("teste $index")
        index++
        if(index==50){
            break
        }
    }

}