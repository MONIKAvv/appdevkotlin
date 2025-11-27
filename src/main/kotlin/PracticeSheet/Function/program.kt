package PracticeSheet.Function

class program {
}

fun displayName() {
    println("My name is Aomine Daiki")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}



fun main() {

    println("Please enter integer")
    try {
        val n2 = readLine()!!.toInt()
        println("You entered $n2")
    }catch (e: Exception){
        println("Invalid Number ${e.message}")
    }

//    val n1 = 0
//    try {
//        val result = 10/n1
//        println(result)
//    }catch (e :java.lang.Exception){
//        println("Error occures ${e.message}")
//    }

//    displayName()
//    println(sum(2, 5))
//
//    var num = {n:Int, m: Int -> n + m  }
//    println(num(8,9))

}