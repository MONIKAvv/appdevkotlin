package PracticeSheet.NullSafety

class program {
}


fun main(){

//    var age: String? = null  //-> error
    var age: String? = "monika"
   println(age!!.length)


    var fullName: String? = null
    var result = fullName?:"Monika Kumari"
    print(result)


//    its not possible to insert null to any variable

    var name: String? = null
//    name = "monika"
//    println(name)
//    println(name?.length)


}