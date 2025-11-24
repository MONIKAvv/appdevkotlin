package oops

enum class OrderStatus {
    PENDING,
    CONFIRMED,
    DELIVERED,
    CANCELLED
}

fun handleOrder(status: OrderStatus){
    when(status){
        OrderStatus.PENDING -> println("Status is Pending")
        OrderStatus.CONFIRMED -> println("Staus is confirmed")
        OrderStatus.DELIVERED -> println("Status is delivered")
        OrderStatus.CANCELLED -> println("Status is cancelled")
    }
}
enum class PaymentMethod(val fee: Double) {
    CASH(0.0),
    CARD(2.5),
    PAYPAL(3.0); // PROPERTIES KHTM KARNE KE LIYE

    fun finalAmount(amount:Double): Double{

        return amount + (amount * fee /100 )
    }

}



fun main(){

    val status = OrderStatus.CANCELLED
    handleOrder(status)
//    println("Your order status: $status")


//    val method = PaymentMethod.CARD
//    println("Final Amount: ${method.finalAmount(1000.0)}")
//    println(method)



}