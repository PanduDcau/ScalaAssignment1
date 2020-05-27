object sal {
  def main(args: Array[String]) {
     
	  
      println( "Salary: " + Salary(h1,h2) );
	  println( "Net Profit After Tax Payment: " + netpay(h1,h2) );
	  
   }
   
   var rate:Double=150.00;
   var ot:Double=75.00;
   
   def Salary(h1:Int,h2:Int):Double=h1*rate + h2*ot;
    val h1=scala.io.StdIn.readInt();
	  val h2=scala.io.StdIn.readInt();
	  println( "Working Hours: " + h1 );//First Input working Hours
	  println( "Overtime Hours: " + h2 );//seccond input overtime Hours
	  
   def tax(Salary:Double) : Double =Salary match{
      case x if x<= 10 => 0
	case x if x<=100000 => x*.1
}
      def netpay(hour1:Int,hour2:Int):Double=
	  Salary(hour1,hour2) - tax(Salary(hour1,hour2));
   
}