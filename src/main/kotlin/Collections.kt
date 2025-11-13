fun main(){
//    list, map, set
//    collections is a container for multi values objects, strings, number, it is immutuable by default and can use mutuable version as well

//    list -> most used one, stores values in ordered, duplicates are allowed

//    val groceries = listOf("monika", "kumari", "is", "a", "good", "girl")
//    val groceries = mutableListOf("monika", "kumari", "is", "a", "good", "girl")
//    groceries.add("Egg")
//    groceries[1] = "butter"
//    println(groceries)
//
//print(groceries.contains("monika "))
//print(groceries.size)


//    set -> unique values, no order guaranteed, no index

//    val students = setOf("Monika", "light", "L", "L")
//    println(students)
////    println(students.elementAt(2))  //inorder to get one specific element
//    for (std in students){
//        println(std)
//    }
//
//    students.forEach {
//        println(it)
//    }

//    map -> stores values with unique key, access via key not index, key should be unique but values could be same
//    println(student)
    val student = mapOf(100 to "monika", 3 to "monika")
//    println(student[1
    student.forEach{
        println(it)
    }
    for ((key, value) in student){
        println(key)
        println(value)
    }


}