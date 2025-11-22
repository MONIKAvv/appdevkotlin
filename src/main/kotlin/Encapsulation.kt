class BankAccount {
     private var balance: Int = 100

    fun getBalance() : Int{
        return balance
    }

    fun deposite(amount: Int): Int{
        balance += amount
        return balance

    }

/*
  if any property is private then we can use that inside that class only



 */
}

fun main(){

    val account = BankAccount()
//    account.balance --> can not used if the class property is private

print("Balance: ${account.getBalance()}")
    println("Deposited balance is : ${account.deposite(900)}")

}

