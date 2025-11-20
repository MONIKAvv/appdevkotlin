class Student (age: Int){
    var name :String = ""
    var age: Int = 0

    constructor(name: String, age: Int) : this(age) {
        this.name = name
        println("Nmae os of constructor and age is : $name, $age")


    }


}


fun  main(){

 /*   println("Printing task 1")
    Thread.sleep(2000)
    Thread{
        println("Printing task 2")
        println("Printing task 3")
        Thread.sleep(2000)
        println("Printing task 4")
        println("Printing task 5")
    }.start()

    println("Printing task 6")
    println("Printing task 7")

  */

  var st1 = Student(5)
  st1.name = "Monika"
    var st2 = Student("light yagami", 4)



}






/* coroutines and concurrency
    concurrency -> many task works at the same time like waiter example taki koe bhi task ko wait n karna pade
    coroutine -> .launch{} use karte hai, background task run karta hai
                 like thread -> but thread has some limitation or can say corotine works more efficient
                 that's why we use coroutine
                 coroutine -> parent se link hota hai, if koe task chal rha hai and then we stop the screen
                 then coroutine bhi close ho jaati hai, taki memory usage n ho


    Suspend function -> if any task is running in background then any other task perform at that time
                         taki ui affect n ho

    Synchronous and Asynchronous
     synchoronous -> one task execute only after the completion of previous task
     Asynchornous -> parallel me run karta hai

     Constructor
                -> primary and secondary constructor
                bhai esse pura karo, plus app wala dekho or admob bhi





 */