package oop

//Create a fruit class that expects every fruit to have the following
//properties;
//color//weight
//Create another class for shop products inheriting color and
//weight from a fruit class with the following additional methods
  //allows_boiling
  //can_be_eaten_raw
  //can_be_used_in_concotion

//NB every input from the user


fun main(args: Array<String>) {

}
open class Normaluser(open var email:String,open var password:String){
    fun login(){
        println("Yeah,I can login")
    }
    fun access_portal(){
        println("Yeah,I can access the students portal")
    }
}
class Admin(override var email: String,
            override var password: String):Normaluser(email, password){
    fun add_users(){
        println("Yeah, I can add users")
    }
    fun suspend_student(){
        println("Yeah, I can suspend a student")
    }
}