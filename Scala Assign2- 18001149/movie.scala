object movie {
  def main(args: Array[String]) {
   
     var list = List(h1,h2,h3)          // Creating a list  
        for( i <- list){
     var net:Double = 0
	 var attendance:Int=120 + (15 - i)/5*20;
	 
	    net=i*attendance;
	  
	 var netpay:Double=net-perform-attendance*3;
		
             println( "Net Profit In Theater : " + netpay ); 
			 //println( "The Ticket Price: " + tic ); 
        } 
		
	    
   }
   
   var perform:Double=500.00;
   
    val h1=scala.io.StdIn.readInt();
	val h2=scala.io.StdIn.readInt();
	val h3=scala.io.StdIn.readInt();
	  println( "Ticket Price 1: " + h1 );//First Input attendance
	  println( "Ticket Price 2: " + h2 );//Second Input attendance
	  println( "Ticket Price 3: " + h3 );//Third Input attendance
	         
}			
