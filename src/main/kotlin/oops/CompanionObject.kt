package oops

class SingletonObject() {

    object monika{
        fun FullName(){
            println("Full name is : Monika kumari")
        }
    }
    object light{
        fun Age(){
            println("Age is 21")
        }
    }
}

class CompanionObject (){

    companion object {
        fun Age() {
            println("Age is 21")
        }

        fun FullName() {
            println("Full name is : Monika kumari")

        }

        fun Sum( x: Int,  y: Int){
            println("Sum of two number: ${x+y}")
        }
    }
}

fun main() {


//    SingletonObject.light.Age()
//    SingletonObject.monika.FullName()
    CompanionObject.Age()
    CompanionObject.Sum(2,3)


}