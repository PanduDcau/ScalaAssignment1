object fibon {
   def main(args: Array[String]) {
    val m=scala.io.StdIn.readInt();
      for (i <- 0 to m)
         println( "Fibbonacci of " + i + ": = " + fib(i) )
   }
   
   def fib(n: Int): Int = {  
      if (n == 1)
         1;
		 
      else if (n == 0)
		0;
		
      else    
      fib(n - 2) + fib(n - 1);
   }
}
