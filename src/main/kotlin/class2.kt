
const val MAX_USER = 20
//strict restrication at compile time , val throws error on conpile time aswell but it is assigned at runtime
//but const assign at compile time
fun main(){

//    println(MAX_USER)

//    println("Please enter your name")
//    val name = readln()
//    readln only get inputs as string
//    print("Hii $name, nice to meet you!")


/*   val val1 = readln()
//    val val2 = readln()
//    println("Sum of both are: ${val1 + val2}") // will return (concate)
//    to get rid of this we use type conversion
//    readln.toInt() */

    val val3 = readln().toInt()
    val val4 = readln().toInt()

    val val5 = val3.toString()
    val val6 = val4.toString()
    print("${val5+val6}")
//    print("${val3+val4}")
}