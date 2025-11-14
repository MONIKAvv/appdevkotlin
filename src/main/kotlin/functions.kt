fun morningRoutine(){
    println("Coffee Banao !")
    println("Shafai !")
    println("Bartan dho !")
}

fun getSum(): Int{
    return 2 + 3
}
fun myName():Unit{
    print("this is monika")
}

fun getSumm(): Int = 5+6 // we can remove here return type as well qki hame pata chal rha h n ki
//int type h to likh bhi sakte h or nhi bhi

fun main(){
//    morningRoutine()
//    morningRoutine()
//    print(getSum())
    val sum = getSumm()
    print(sum)

//    myName()

}

//function that doesn't return anything are denoted as :Unit
//if we want to return only one thing then we can return that using single return expression
// fun getSum(): Int = 5 + 5 -> esme return karne ki jarurt nhi h
