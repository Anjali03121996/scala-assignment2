class BankAccount {
  var balance : Double = 0
  var id : Int = 0
  def openAccount(id : Int)={
    this.id =id
    balance = 0
    println("Your account is created with ID = " + id + " , Available balance : " + balance)
  }
  def closeAccount()={
    println("Your account has been closed!")
    balance = 0
  }
  def depositAccount(money : Double) ={
    if(money > 0) {
      balance += money
      println("Amount deposited successfully, your new balance is : " + balance)
      balance
    }
  }
  def withdrawAccount(money  : Double)={
    if(money <= balance) {
      balance -= money
      println("Amount withdraw successful, your new balance is : " + balance)
      balance
    }
  }
  def showBalance() : Double ={
    println("Balance is = " + this.balance)
    this.balance
  }

}
object BankAccount {
  def main(args: Array[String]): Unit = {
    // var accountID = Array[Int](1, 2)

    val operation = new BankAccount
    val operation2 = new BankAccount

    operation.openAccount(1)
    operation2.openAccount(2)

    operation.depositAccount(500.00)
    operation2.depositAccount(1000.00)

    operation.withdrawAccount(250.00)
    transferFunds(2, 1000)
    operation.closeAccount()

    def transferFunds(id: Int, amount: Double): Unit = {
      println("Fund transfer from " + operation2.id + " to " + operation.id)
      operation.balance = operation.balance + amount
      println("After transfer balance of id = " +operation.id + " is " + operation.showBalance())
      operation2.balance = operation2.balance - amount
      println("Balance of id = " + operation2.id + " is : " + operation2.showBalance())
    }
  }

}
