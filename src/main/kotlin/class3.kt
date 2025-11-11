

fun main(){
// println("Hello todays is class3rd")

// val name: String ?= null
// val finalstmt = name?: "monika"
// print(finalstmt)
//
// val name: String ?= "monika"
// val length = name!!.length
// print(length)

// val marks = 120
// val grade = when{
//  marks >=90 -> "A+"
//  marks >= 70 -> "B"
//
//  else -> "Pleasee Enter valid marks"
// }
// print(grade)

// val dayNumber = 9
// when(dayNumber){
//  1 -> print("sunday")
//  2 -> print("Monday")
//  3 -> print("Tuesday")
//  else -> print("Beta ghar jao tum")
// }

//uses of ranges
// val age = 259
// when(age){
//  in 0..12 -> print("child")
//  in 13.. 19 -> print("Teen")
//  in 20..59 -> print("Adult")
//  in 60..100 -> print("Senior citizen")
//  else -> print("babu tum ghar hi jao")
// }

// null in depth

 var name:String? = "monika"
 var name2 = name?:"hey this is monika"
 print(name2)
 val len= name2?.length
 print(len)
 name2.let {
  print(name2)
 }


}