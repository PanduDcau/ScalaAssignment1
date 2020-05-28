
object primefind {

  def main(args: Array[String]) {
		val m=scala.io.StdIn.readInt();
		var rem:Int = 1;
		var s:Int = 1;
		
		
	println("Prime Numbers Between 1 to " + m);
	for (i <- 2 to m)
	{
	 rem = primeno(i,i/2);

        if (rem == 1)
           println( " := " + i);
	}
	
	}
   
 def primeno(num: Int, max: Int): Int = { 
 
     if(max == 1)
         return 1;
         else
         {
         if(num % max == 0)
         return 0;
		 
         else
         primeno(num, max-1);
         }
		
    }	

}		