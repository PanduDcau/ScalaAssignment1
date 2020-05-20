object Cal2 {
  def main(args: Array[String]) {
      println( "Volume of The Sphere: " + Sphere(5.00) );
   }
   
   def Sphere( r:Double) : Double = {
      var Volume:Double = 0
      Volume = (4*r/3)*r*r*r

      return Volume
   }
}