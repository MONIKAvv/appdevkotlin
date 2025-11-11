import java.lang.System.exit

fun main(){

//    Grade Reward System
    println("Please Enter your Grade")
    var grade = readln().uppercase()

    when(grade){
        "A" -> print("You will get Bike")
        "B" -> print("You can go out with your Friends")
        "C" -> print("You will get smart watch")
        "D" -> print("You will get an Ice-cream")
        "F" -> print("Bhai Padhai karo!")

        else -> print("Enter correct grade from A to F only")
    }

}