package oop

fun main(args: Array<String>) {
    var tcrl=Mwalimu()
}

abstract class Mwanafunzi (open var name: String,open var age:Int){
    abstract fun read()
    abstract fun write()
}

class Mwalimu(override var name: String, override var age: Int):Mwanafunzi(name,age)
        override fun read(){
            println("I am a teacher and I can read")
        }
        override fun write(){
            println("I am a teacher and I can write")
        }