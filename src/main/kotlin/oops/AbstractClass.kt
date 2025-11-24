package oops

abstract class Vehicle {
    abstract fun start()
    fun stop(){
        println("Vehicle stopped!")
    }
}

class  Car: Vehicle(){

    override fun start() {
        println("Car started with key!")
    }
}

class Bike: Vehicle(){
    override fun start() {
        println("Bike started with self start Button!")
    }
}

fun main(){

    val car = Car()
    car.start()
    car.stop()
    val bike = Bike()
    bike.start()
    bike.stop()

}