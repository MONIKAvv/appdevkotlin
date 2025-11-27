package oops
open class Person(val name: String)


class Student(name: String) :Person(name)




class Group<out T: Person>(private val member: T){

    fun getMember(): T = member

}

open class Fruit(val name:String)

class Apple:Fruit("Apple")
class FuitDelivery<in T: Fruit>{

    fun delivery(fruit: T){
        println("DElivery ${fruit.name}")
    }
}


fun main(){

    val stdgrp : Group<Student> = Group(Student("Monika"))
    val persongrp: Group<Person> = stdgrp

//    println(persongrp.getMember().name)



    val delivery: FuitDelivery<Fruit> = FuitDelivery()
    val appleDelivery: FuitDelivery<Apple> = delivery

    appleDelivery.delivery(Apple())

}


/*



 */