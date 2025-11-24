package oops

object Singleton {
    val databaseName = "App DB"

    fun connect(){
        println("Database connected to $databaseName")
    }

}

fun main(){
    Singleton.connect()
}