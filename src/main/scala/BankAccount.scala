class BankAccount {
  var balance : Double = 0
  def openAccount(id : Int)={
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
    }
  }
  def withdrawAccount(money  : Double)={
    if(money <= balance) {
      balance -= money
      println("Amount withdraw successful, your new balance is : " + balance)
    }
  }

}
object BankAccount {
  def main(args: Array[String]): Unit = {
    var accountID = Array[Int](1, 2)
    val operation = new BankAccount
    //val operation2 = new BankAccount
    for (i <- accountID) {
      if(i==1) {
      operation.openAccount(i)
    operation.depositAccount(500.00)
    operation.withdrawAccount(250.00)
        operation.closeAccount()
        //transferFunds(2,1000)
  }
      else {
        operation.openAccount(i)
        operation.depositAccount(600.00)
        operation.withdrawAccount(250.00)
        operation.closeAccount()
        //transferFunds(1,500)
      }
    }
    /*def transferFunds(to : Int,amount : Double) ={
      operation.depositAccount(amount)
      operation2.withdrawAccount(amount)
    }*/
}


    // var balance = 0


}
