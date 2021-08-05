import java.util.*

fun main(args: Array<String>) {
    var take= Scanner(System.`in`)
    println("How many employees do you have?")
    var number=take.nextInt()
    var employees = arrayOfNulls<String>(number)
    var salaries= arrayOfNulls<Double>(number)
    println("Enter the $number employees")

    //Write a loop to receive the names and salaries
    var x=0
    while (x<number){
        employees[x]=take.next()
        println("Enter "+employees[x]+"'s salary")

    }
    //Write the loop to print the names and salaries
    var y=0
    while (y<number){
        println(employees[y]+"---------Ksh+salaries[y]"
        y++
    }
}