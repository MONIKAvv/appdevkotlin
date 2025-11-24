package oops

data class FoodItem(
    val name: String,
    val price: Double,
    val category: String

)

fun main(){
    val burger = FoodItem("burger", 34.5, "fast food")
    val pasta = FoodItem("cheese pasta", 60.0, "fast food")

    println(burger) //toString -> string ki formate me print ho jaati hau
    println(pasta)

    println(burger.hashCode())
    println(pasta.hashCode())

    println(burger.category == pasta.category)

    println(burger == pasta)
    println(burger.equals(pasta))

    val newBurger = burger.copy(price = 55.5)
    print(newBurger)

    val (name, price, category) = burger
    println(name)
    println(price)
    println(category)




}
