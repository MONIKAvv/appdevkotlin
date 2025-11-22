open class Vehicle {
var speed: Int = 0

   open fun move(){
        println("Speed: $speed km/h")
    }


}
class Car: Vehicle() {

    fun playMusic(){
        println("Playing music")
    }

    override fun move() {
        println("Speed of Car is: $speed km/h")
    }
}

class Bike: Vehicle(){

    fun applyBreaks(){
        println("Breaks applied!!!")
    }

    override fun move() {
        println("Speed of Bike is : $speed km/h")
    }
}

fun main() {
//    val myCar = Car()
//    myCar.speed = 90
//    myCar.move()
//    myCar.playMusic()

    val myBike = Bike()
    myBike.speed = 60
    myBike.move()
    myBike.applyBreaks()


}

/*
open keyword use karte hai with parent class
and child class inhert parent using : with parent class name with ()

overriding in inheritance->kabhi kabhi hm parent clas ko aapnse hisaab se change krte hai child class me apne hisaab se

we can't not inherit multiple class in one child class

 */