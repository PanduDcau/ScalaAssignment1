object evensum {

  def main(args: Array[String]) {
		val n=scala.io.StdIn.readInt();
		var sum:Int=0;
		var m:Int=0;
		
	if(n%2!=0)
   {
             
     m=n-1;
             
  }
 
  else 
   m=n-2;
   
   sum =sumeven(m);
	
	println("Sum of Even Numbers in the Range from 1 to"+n+ " :=" + sum );
	
	
	}
   
 def sumeven(num:Int): Int = { 

	
    if(num == 2)
    { 
    return 2;        
     }
     
    else
    {
      return(num + sumeven(num-2)); 
     }  
		     
     
   
		
    }	

}		
