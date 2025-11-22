class Calculator {

    fun add(a:Int, b:Int){
        println("Sum: ${a+b}")
    }

    fun add(a: Int, b: Int, c: Int){
        println("Sum: ${a+b+c}")
    }

}


open class Animal{

    open fun sound(){
        println("Animal makes a sound!!!")
    }
}

class  Dog:Animal(){

    override fun sound() {
        println("Dog is barking")
    }
}

class Cat:Animal(){
    override fun sound() {
        println("Cat meows")
    }
}



fun main(){
//    val calc = Calculator()
//    calc.add(2,3)
//    calc.add(2,3,4)

    val ani = Animal()
    ani.sound()
    val dog = Dog()
    dog.sound()
    val cat = Cat()
    cat.sound()

}

/*
compile time polymorphism-> method overloading
runtime polymorphism -> method overriding



 */