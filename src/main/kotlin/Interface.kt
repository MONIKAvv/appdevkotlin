interface RemoteControl {

    fun powerOn()
    fun powerOff()

}


class Remote: RemoteControl{
    override fun powerOn() {
        println("remote is on")
    }
    override fun powerOff() {
       println("Remote power off")
    }
}

interface Camera{
    fun takePhoto()

}
interface MusicPlayer{
    fun playMusic()

}

class SmartPhone: Camera, MusicPlayer{
    override fun takePhoto() {
        println("Smart phone takes photo using camera")
    }

    override fun playMusic() {
        println("Smart phone playing music ")
    }
}

interface Greet{
    fun sayHello(){
        println("Heloow from Interface")
    }
}
class Person: Greet{
//    override fun sayHello() {
////        println("Hello Good Morning!!! from person")
//    }
}

fun main(){

//    val obj = Remote()
//    obj.powerOn()
//    obj.powerOff()

//    val phone = SmartPhone()
//    phone.playMusic()
//    phone.takePhoto()

    val mess = Person()
    mess.sayHello()

}

/*
blueprint hota h -> methods , method define kar dete hai logic nhi likhte

100% abstraction -> java me

child class ko inheritance krna hi padega or child define karega methods ko



Multiple Interfaces -> one class can "implement" multiple interface


Default Method in Interface -> if child class bhul gaye implement karna interface ko
                                then default interface method call hota hai.

 */