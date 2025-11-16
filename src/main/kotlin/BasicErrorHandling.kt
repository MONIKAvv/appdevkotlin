fun BasicErrorHandling(a: (Int)->Int, b: Int) :Any{
return a
}fun BasicErrorHandling(a: Int, b: String):Any {
return b
}
fun operator(a: Int, b: Int, op: (Int, Int) -> Int):Int{
    return a+b
}

fun main(){
//    val a = BasicErrorHandling(2,3)
//    val b = BasicErrorHandling(2," monika ")
//    val c = {n:Int -> n*n}
//    println( BasicErrorHandling(c,4))

   val sum = operator(2, 3) { a, b -> a * b }
    println(sum)

//    val list = listOf(1,2,3,4,5)
//    list.forEach{println(it)}
//
//    val even = list.filter { it %2 == 0 }
//    println(even)
//    val double = list.map { it * 2 }
//    println(double)



//    println(b)




//    try {
//        val result = 10/ 0
//        println(result)
//    }catch (e: ArithmeticException){
////        println("Error: ${e.message}")
//        println("Hey whatsApp. Try Again")
//    }finally {
//        println("Acche se padho")
//    }
}



//try -> risky code
// catch -> error catch krta hai, code here -> "Exception" me saari expection aa jati h,
//specify krne ki jarrut nhi hoti
// finally block -> always run, dono cases main run hota hai
