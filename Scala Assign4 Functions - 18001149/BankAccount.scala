
object BankAccount extends App {
 
		  var s1 = new Account(" 986781v ",13249,-150) 
		  var s2 = new Account(" 979984v ",56787,-800) 
		  var s3 = new Account(" 967856v ",98078,400) 
  
  
	var bank:List[Account]=List(s1, s2, s3)    //Adding the Account objects to the List Array

	val overdraft=(b:List[Account])=> b.filter(x=>x.balance<0)  // Filtering the Minus balances from the Lists
    println(" Accounts with Minus  Balances  Are : " +overdraft(bank)) //Choosing the Negative Balances using Overdraft Method
 
    val intrest=(b:List[Account])=>b.map(x=>x.balance)
 
      val balc=intrest(bank).reduce((x, y)=>x+y)
	  println("Sum of All Account Balances :"+balc)
  
	val interest=(b:List[Account])=>b.map(x=>(x.nic, x.accno, if(x.balance<0){x.balance*1.1} else x.balance*1.05))
	println("Final Balances of All Accounts After Apply the Interest Function :"+interest(bank))
	
	

}

		class Account(id:String, n: Int, b: Double) 
		{
					val nic:String=id
					val accno: Int = n
					var balance: Double = b
					override def toString ="[" +nic+ ":" +accno + ":"+ balance+"]"

					def withdraw(a:Double) =this.balance=this.balance-a
					
					def deposit(a:Double) =this.balance=this.balance+a
					
					def transfer(a:Account,b:Double)= {
					  this.balance=this.balance-b
					  a.balance = a.balance+b
		}
  

}
