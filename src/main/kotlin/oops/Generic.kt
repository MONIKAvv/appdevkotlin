package oops

class IntPrinter (val value: Int){
    fun printValue(){
        println("Value : $value")
    }
}

class StringPrinter(val value: String){
    fun printValue(){
        println("Value: $value")
    }
}


//this is generic type
class  Printer<T>(private val value:T){

    fun printValue(){
        println("Value: ${value}")
    }
}

fun main(){

//    val intValue = IntPrinter(40)
//    intValue.printValue()
//    val stringValue = StringPrinter("monika")
//    stringValue.printValue()
//
//    val printValue = Printer("90")
//    printValue.printValue()
//    val printV = Printer(90)
//    printV.printValue()


    val myList = listOf<Int>(1,2,3)

}