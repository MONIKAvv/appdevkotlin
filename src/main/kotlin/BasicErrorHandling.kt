fun BasicErrorHandling() {

}

fun main(){
    try {
        val result = 10/ 0
        println(result)
    }catch (e: ArithmeticException){
//        println("Error: ${e.message}")
        println("Hey whatsApp. Try Again")
    }finally {
        println("Acche se padho")
    }
}

//try -> risky code
// catch -> error catch krta hai, code here -> "Exception" me saari expection aa jati h,
//specify krne ki jarrut nhi hoti
// finally block -> always run, dono cases main run hota hai
