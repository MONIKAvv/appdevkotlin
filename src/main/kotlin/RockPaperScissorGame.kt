import kotlin.random.Random

fun main(){

//    rock > scissor
//    paper > rock
//    scissor > paper

    print("Choose Rock , Paper or Scissor: ")
    val userChoice = readln().lowercase()

    if (userChoice == "rock" || userChoice == "paper" || userChoice == "scissor"){
//        get computerchoice
        var randomNumber = (1..3).random()
        var computerChoice = when(randomNumber){
            1 -> "rock"
            2 -> "paper"
            else -> "scissor"
        }

        println("Computer's choice is: $computerChoice")

//        checking game constraints
        if (userChoice == "rock" && computerChoice == "scissor" || userChoice == "paper" && computerChoice == "rock"
            || userChoice == "scissor" && computerChoice == "paper"){
            println("You won this game!")
        }else if (userChoice == computerChoice){
            println("Game Draw!")
        }
        else{
            println("You Lost!")
        }

    }else{
        println("Please choose either rock, paper or scissor only")
    }

}