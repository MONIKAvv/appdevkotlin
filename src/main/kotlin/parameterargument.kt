fun greet(fName: String, lName: String = "kumari", age: Int = 40) {
    print("hiii $fName $lName she is of $age")
}

fun orderSummary(item1: String){
    println("Here is oyur order Summary :")
    println("1. $item1")
    println("------------------------------------")
    println("Thanks , Visit Again !!")

}fun orderSummary(item1: Int){
    println("Here is oyur order Summary :")
    println("1. $item1")
    println("------------------------------------")
    println("Thanks , Visit Again !!")

}

fun orderSummary(item1: String, item2: String){
    println("Here is oyur order Summary :")
    println("1. $item1")
    println("2. $item2")
    println("------------------------------------")
    println("Thanks , Visit Again !! , you are in next shop")
}

fun main(){
//    greet(lName = "Monika", fName = "how are oyu")
    orderSummary("watch")
    println("\n")
    orderSummary(234)
    println("\n")
    orderSummary(item2 = "perfume", item1 = "hard")


}


//default parameter
//name argument
//function overloading