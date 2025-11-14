fun lamdaExpression (n : Int): Int{
    return  n*n

}

fun operate(a: Int, b: Int, lamda:(Int, Int) -> Int): Int{
    return lamda(a, b)

}

fun main(){
//    val exp = lamdaExpression(5)
//    print(exp)

//    val expression = {n: Int ->
//        n*n*n
//    }
//    println(expression(5))
//   val result = operate(10,5,{x,y -> x-y})
   val result = operate(10,5){x,y -> x-y} //esse trailing lamda bolte h
    println(result)
}

//function ko value ki trah treat karna, and has no name(annonimus function
//lamda as a function parameter