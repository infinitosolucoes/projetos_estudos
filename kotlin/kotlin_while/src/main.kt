fun main(){
    var index = 0
    while (index <=100){
        println("teste $index")

        if(index==50){
            break
        }
    }

    do {
        //coindex++
        println("condição falsa")
        index++
    } while (index <=100)
}