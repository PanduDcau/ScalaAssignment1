object Cal3 {
def main(args: Array[String]) {
      println( "Total Cost of the Transaction: " + findbookcost(60) );
   }
   def findbookcost( s:Int) : Double = {
      var y=(24.95*60)*0.6;
      
	 if(s>50)
	 { 
	    y=y+(s-50)*0.75;
	  }
      y=y+3;	  
      y;
   }
}