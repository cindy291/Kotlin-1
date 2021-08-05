import java.util.*

fun main(args: Array<String>) {
    var take= Scanner(System.`in`)
    println("How many students do you have?")
    var number=take.nextInt()
    var students= arrayOfNulls<String>(number)
    var marks= arrayOfNulls<Double>(number)
    var admission= arrayOfNulls<Double>(number)
    println("Enter the $number students")

    //Write a loop to receive the names,admission number and marks
    var x=0
    while (x<number){
        students[x]=take.next()
        println("Enter "+students[x]+"'s marks"+ admission)

    }
    //Write the loop to print the names and admission numbers
    var y=0
    while (y<number) {3
        println(students[y]+"----"+marks)
        y++
    }
    }