package PracticeSheet.ConditionalStmt

class program {
}

fun main(){

    println("Enter any alphabet letter")
    val character = readln()
//    if (character == "a" || character == "e" || character =="i" ||character =="o"|| character=="u"){
    if (character.lowercase() in "aeiou"){
        println("You Enter vowel $character")
    }else{
        println("You choose consonant $character")
    }

//    println("Please Enter between 1 to 7 to get day")
//    val day = readln().toInt()
//    when(day){
//        1 -> println("Sunday")
//        2 -> println("Monday")
//        3 -> println("Tuesday")
//        4 -> println("Wednesday")
//        5 -> println("Thrusday")
//        6 -> println("Friday")
//        7 -> println("Saturday")
//    }

//    println("Enter your total marks")
//    val marks = readln().trim().toInt()
//
//    if (marks in 90..100){
//        println("Your Grade is A")
//    }else if (marks in 80..89){
//        println("Your Grade is B")
//    }else if (marks in 70..79){
//        println("Your Grade is C")
//    }else if (marks in 60..69){
//        println("Your Grade is D")
//    }else{
//        println("You failed!!!")
//    }

//    println("Enter any number")
//    val num = readln().toInt()
//    if (num == 0){
//        println("$num is 0")
//    }else if (num < 0){
//        println("$num is negative")
//    }else{
//        println("$num is positive")
//    }

}