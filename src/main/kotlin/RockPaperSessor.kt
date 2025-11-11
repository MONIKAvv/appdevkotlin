fun main(){

//    rock>scissor
//    scissor >paper
//    paper>rock

    println("Welcome to Rock Paper Scissor Game")
    println("Choose one> Rock, Paper, Scissor")

    print("Enter your choice : ")
    val userChoice = readln().lowercase()

    if (userChoice == "rock" || userChoice == "paper" || userChoice =="scissor"){
        val randomNumber = (1..3).random()
        val computerChoice = when(randomNumber){
            1 -> "rock"
            2 -> "paper"
            else -> "scissor"
        }
        println("Computers choose: $computerChoice")

        if (userChoice == computerChoice) print("Game is draw!")
        else if (
            (userChoice == "rock" && computerChoice == "scissor") ||
            (   userChoice == "scissor" && computerChoice == "paper") ||
            (     userChoice == "paper" && computerChoice == "rock")
        ){
            print("You won!!")
        }else{
            println("You Lose!!")
        }
    }
     else {
        print("Please Enter rock , paper or scissor only")
    }



}