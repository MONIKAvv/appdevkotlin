fun higherOrderFunction(a: Int, b: Int , op: (Int, Int)-> Int): Int {
    return op(a, b)

}
fun greeting():() -> String{
    return {"hii, welcome to neatroots"}

}

fun main(){
    val result = higherOrderFunction(10, 5, op = {x, y -> x*y})
    print(result)
    val greet = greeting()
    println(greet())

}

//higher order function can return and accept values -> reusability and flexibility
//higher order ko call krne ke liye hm () k use karte hai
//upar neeche daye baye karke check kar lo