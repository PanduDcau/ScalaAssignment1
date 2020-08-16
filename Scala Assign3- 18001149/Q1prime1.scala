object prime1 {
  def main(args: Array[String]) {
		val m=scala.io.StdIn.readInt();
		var check:Int= primeno(m,m/2);
		
	if(check == 1)
	{
             println(+ m + " Is a Prime Number: "  ); 
			 }
	else		 
	     println(+ m + " Is not a Prime Number: "  );
   }
   
 def primeno(n: Int, i: Int): Int = {  
  
    if (i == 1)
    {
        return 1;
    }
    else
    {
       if (n % i == 0)
       {
         return 0;
       }
       else
       {
         return primeno(n, i - 1);
       }       
    }
}
	         
}			
