fun Sum() {

}

fun operate(a: Int, b: Int ,
            op:(String)-> String):String{
    return op("monika")
}

fun main() {

//    sum of 1 to 100
//    var sum = 0
//
//    for (i in 1..100) {
//        sum += + i
//
//
//    }
//    println(sum)

    val ans= {it: String ->
    println(it)
    }
    val num = 5
//    print(ans("num"))
    var result = operate(2,5, {a -> "kumari"})
    println(result)
}


//{parameter -> body }