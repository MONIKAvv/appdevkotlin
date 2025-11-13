fun main() {

//    nullable in depth concept
//    user itself can't enter null, null only happens during transactions and tranmission of data
//    ? -> is a nullable type
//    print("Enter name")
//    var name : String? = readLine()
//
//    val displayName = name?: "Guest"
//
//   print("WElcome $displayName")


//print("Enter your Email")
//    var email : String? = readLine()
//    val displayEmail = if(email.isNullOrBlank()) "Email not provided "
//    else "$email"
//    println("Entered Email is: $displayEmail")

//    print("Enter your age ")
//    var age: Int? = null
//   val displayAge = age?: 4
//    println(displayAge)

//    val city: String? = null
//    val cityLength = city?.length
//    print(cityLength)

//    val delivery :String ? = "on process"
//    val display = delivery?: "delivered!"
//    println(display)

//    var phoneNumber: String? = null
//    phoneNumber.let {
//        println("calling $it...")
//}

    val name : String? = "monika"
    println(name!!.length)
}