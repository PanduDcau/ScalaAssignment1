object addnum {

  def main(args: Array[String]) {
		val m=scala.io.StdIn.readInt();
		var su:Int = 0;
		su=addno(m);
		
	println("Summation Numbers Between 1 to " + m + ":-" + su);
	
	}
   
 def addno(num: Int): Int = { 
 
     var sum:Int=0;
	 
     if (num == 1)
    {
        return 1;
    }
    else
    {
        sum = num + addno(num - 1);
        
    }
		return sum;
    }	

}		