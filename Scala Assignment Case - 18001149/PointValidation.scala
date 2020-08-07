

case class Point(val xc: Int , val yc: Int) {

   var x: Int = xc
   var y: Int = yc
   
   
   def +(that:Point)=Point(this.x+that.x,this.y+that.y)
   
   def move(dx: Int, dy: Int) =Point(this.x+dx,this.y+dy)
   
   def -(that:Point)=Point(this.x-that.x,this.y-that.y)
   
}

class Location(override val xc: Int, override val yc: Int,//Override mechanism if 3 points being 
//initialized
   val zc :Int) extends Point(xc, yc){
   var z: Int = zc

   def move(dx: Int, dy: Int, dz: Int) {
      x = x + dx
      y = y + dy
      z = z + dz
	  println("New Location Of The Three point Variable")
      println ("Point x location : " + x);
      println ("Point y location : " + y);
      println ("Point z location : " + z);
	  println("\n")
   }
}



object PointValidation {
   def main(args: Array[String]) {
   
      val loc = new Location(10, 20, 15);//When three points initilized only moving
//point is avaialable (Overide)
      // Move to a new location
      loc.move(10, 10, 5);//move three point varaiable
   	  
	  println("Enter the 1st Point in (x,y) Coordinates: ")
          var i = scala.io.StdIn.readInt()
          var j = scala.io.StdIn.readInt()
		  
		  
          println("Enter the 2 st Point in (x,y) Coordinates:")
          var c = scala.io.StdIn.readInt()
          var d = scala.io.StdIn.readInt()

          val p1 = Point(i,j)
          val p2 = Point(c,d)
          val p3 = p1.move(4,7)
          val p4 = p1.copy(xc=j,yc=i)
		  val p5 = p2.copy(xc=d,yc=c)

          
          println("Q1)  Coordinates P1 & P2 Added :") // Question 1
		  println(p1+p2)
		  println("\n")
          println("Q2) Coordinates P1 moved By Given Coordinates(4,7) :"  + p3)    // Question 2
		  println("\n")
          println("Q3) Distance Between Given Coordinates :")  // Question 3
		  println(p2-p1) 
		  println("\n")
          println("Q4) First Coordinates Inversed" + p4)     //Question 4
		  println("    Second Coordinates Inversed" + p5) 
	  
   }
}