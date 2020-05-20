object Cal {
  def main(args: Array[String]) {
      println( "Fahrenheite Value: " + fahrenheite(35.00,32.00) );
   }
   
   def fahrenheite( a:Double, b:Double ) : Double = {
      var sum:Double = 0
      sum = a*1.800 + b

      return sum
   }
}