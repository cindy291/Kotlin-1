fun main(args: Array<String>) {


    var names= arrayOf("Britney","Kelvin","Cindy","Rikki","Precious")
    println(names[0])
    for (name in names){
        println(name)
    }
    println(names.size)

    var arrSize=names.size
    var x=0
    while (x<arrSize){
        println(names[x])
        x++
    }
    var cars= arrayOfNulls<String>(size = 6)
    cars[0]="Porsche"
}