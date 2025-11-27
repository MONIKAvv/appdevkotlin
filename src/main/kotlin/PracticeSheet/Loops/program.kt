package PracticeSheet.Loops

class program {
}


fun main(){


    val listOfNum = mutableListOf(1,2,3,4,5)
    listOfNum.add(6)
    listOfNum.add(7)
    listOfNum.add(8)
    listOfNum.add(9)
    println(listOfNum)
//    listOfNum.remove(4)
//    println(listOfNum)
    val count = listOfNum.count{it %2 == 0}
    val sum = listOfNum.sum()
    println(count)
    println(sum)

//    for (i in 1..20){
//        if (i == 10)continue
//        else if (i == 15) break
//        else println(i)
//    }

//    println("Multiplication Table")
//    val n= 5
//    for (i in 1..10){
//        println(" $n * $i = ${n*i}")
//
//    }

//    var i: Int = 1
//    while (i in 1..10){
//        println(i)
//        i++
//    }

}