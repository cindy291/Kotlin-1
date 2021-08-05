fun main(args: Array<String>) {
    var x:Int=0
    while (x<5){
        println(x)
        x++
    }

    //DO WHILE LOOP
    var y:Int=10
    do{
        println(y)
        y++
    }while (y<15)

    //repeat loop
    repeat(10){
        println("Hello King")
    }

    //For loop
    var names= arrayOf("Cindy","Becky","Britney")
    for (jina in names){
        println(jina)
    }
    //var numbers
    var numbers=10 downTo 1
    for (nambari in numbers){
        println(nambari)
    }
}