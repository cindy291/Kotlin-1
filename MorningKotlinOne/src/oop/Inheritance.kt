package oop

fun main(args: Array<String>) {
    var mtoto1=()
    mtoto1.cry()
    mtoto1.cook()
    mtoto1.wash()
}
class Parent(open var name: String, open var age:Int){
    fun cook(){
        println("Yeah,I can cook")
    }
    fun wash(){
        println("Yes, I can wash")
    }

}
class child(override var name: String,override var age: Int):Parent(name, age)

fun cry(){
    println("Yes,I can cry")
}