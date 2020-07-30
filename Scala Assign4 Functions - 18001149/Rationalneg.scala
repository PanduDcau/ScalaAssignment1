
class Rational(x: Int, y: Int) {
     def numer = x
     def denom = y
	 
	 require(y != 0, "denominator must be non-zero");
	 
	 def this(x: Int) = this(x, 1)
	 
  def add(r: Rational):Rational= 
  new Rational(numer * r.denom + r.numer * denom,denom * r.denom)
    
    //val m=scala.io.StdIn.readRational();	
	//var addition:Rational = add(m);
	 
  def mult(r: Rational)= new Rational(numer * r.numer, denom * r.denom)
  def *(r: Rational): Rational = mult(r)
  
  override def toString = s"$numer/$denom";
 
      def +(r:Rational) = new Rational(this.numer * r.denom +r.numer * this.denom, denom * r.denom)                   
	  def neg = new Rational(-this.numer,this.denom)
	  def -(r:Rational) = this+r.neg
	  
	  //println("Number Value is :" + t);	
	  }


object Rationalneg {
    
	def main(args: Array[String]) {
	 val x = new Rational(1, 3)
     val y = new Rational(5, 7)
     val z = new Rational(3, 2)
	 
	 var t:Rational=x.neg.mult(y).add(z);
	 println("Number Value is :" + t);	
     
 }
  
}