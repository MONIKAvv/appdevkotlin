package PracticeSheet.VariableDT

import kotlin.reflect.typeOf

class program {
}

const val course = "MCA"

fun main(){

    println("Please enter any number")
    val num = readln().toInt()
    if (num in 1..50){
        println("Number is between 1 to 50")
    }else{
        println("Entered number is not between 1 to 50")
    }



//    println("Enter your name please!")
//    val name = readln()
//    println("Good Morning $name")


//    println("Enter two number")
//    var num1 = readln().toInt()
//    var num2 = readln().toInt()
//    println("Sum of $num1 and $num2 is: ${num1 + num2}")
//    println("Difference of $num1 and $num2 is: ${num1 - num2}")
//    println("Product of $num1 and $num2 is: ${num1 * num2}")
//    println("Division of $num1 and $num2 is: ${num1 / num2}")


//    val name = "Monika"
//
//
//    var age = 21.toDouble()
//    println(name)
//    println(age)
//
//    var salary = 32.45.toInt()
//    println(salary)
//    var s2 = 34.0f
//    println(s2)
//    var yes: Boolean = true
//    println(yes)
//
//    println(course)


}