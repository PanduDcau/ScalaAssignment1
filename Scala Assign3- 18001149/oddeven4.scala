object oddeven4 {
   def main(args: Array[String]) {
    val m=scala.io.StdIn.readInt();

     println( "The Input Number is  " + m + " := " + oddeve(m));
  
         
   }
   
   def oddeve(n: Int): Int = {  
      if(n==0){
	  println("Even Number");
         return 1;
			}
		else if(n==1){
		println("Odd Number");
				  0;
		}
		else if(n<0){
				 return oddeve(-n);
		}
		
		else
		return oddeve(n-2);
	
	  
   }
}