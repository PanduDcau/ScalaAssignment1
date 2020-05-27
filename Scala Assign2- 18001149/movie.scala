object movie {
  def main(args: Array[String]) {
   
     var list = List(h1,h2,h3)          // Creating a list  
        for( i <- list){
     var net:Double = 0
	  var no:Int=i-120;
	 var chan:Int=no/20;
	 var tic:Double=ticket + 5*chan;
	 
	 if(chan>0)
	 { 
	    net=i*(ticket)+i*5*chan;
	  }
      
	  else
	  {
	   net=i*tic;
	  }
	  
	 var netpay:Double=net-perform-i*3;
		
             println( "Net Profit In Theater : " + netpay ); 
			 println( "The Ticket Price: " + tic ); 
        } 
		
	    
   }
   
   var ticket:Double=15.00;
   var perform:Double=500.00;
   
    val h1=scala.io.StdIn.readInt();
	val h2=scala.io.StdIn.readInt();
	val h3=scala.io.StdIn.readInt();
	  println( "Number of Attendance: " + h1 );//First Input attendance
	  println( "Number of Attendance: " + h2 );//Second Input attendance
	  println( "Number of Attendance: " + h3 );//Third Input attendance
	         
}			