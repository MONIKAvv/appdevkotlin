package PracticeSheet.MiniProject

import java.util.Random

class rockpaperscissor {
}

fun main(){

//    paper > rock
//    rock > scissor
//    scissor > paper

    println("Enter Rock , Paper or Scissor")
    val userChoosed = readln().trim().lowercase()

    val random  = (1..3).random()
    val computerChoose = when(random){
        1 -> "rock"
        2 -> "paper"
        else -> "scissor"
    }


    if (userChoosed == "rock" || userChoosed == "paper" || userChoosed == "scissor"){
        println("Computer Choosed : $computerChoose")
        if (userChoosed == "rock" && computerChoose == "scissor" ||
            userChoosed == "scissor"&& computerChoose == "paper"||
            userChoosed == "paper" && computerChoose == "rock"){
            println("You Won!")
        }else if (userChoosed == computerChoose){
            println("Game Draw")
        }else{
            println("You Lose")
        }
    }else{
        println("Please choose only \"rock\" \"paper\" or \"scissor\"")
    }



}
