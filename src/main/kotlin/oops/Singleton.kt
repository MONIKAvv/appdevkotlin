package oops

object Singleton {
    var databaseName = "App DB"

    fun connect(){
        println("Database connected to $databaseName")
    }

}

fun main(){
    Singleton.databaseName = "mysql"
    Singleton.connect()
}