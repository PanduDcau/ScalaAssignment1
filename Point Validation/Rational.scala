// A rational number x / y is represented by 2 integers x and y
// x is called the numerator and y is called the denominator

class Rational(x: Int, y: Int) {

  // require is used to enforce a precondition on the caller
  require(y != 0, "denominator must be non-zero")

  // define a greatest common divisor method we can use to simplify rationals
  private def gcd(a: Int, b: Int): Int = Math.abs(if (b == 0) a else gcd(b, a % b))

  val g = gcd(x, y)

  val numer = x / g
  val denom = y / g

  // define a second constructor
  def this(x: Int) = this(x, 1)

  // define methods on this class
  def add(r: Rational): Rational =
    new Rational(numer * r.denom + r.numer * denom, denom * r.denom)

  def +(r: Rational): Rational = add(r)

  // negation
  def neg = new Rational(-numer, denom)
  def unary_- : Rational = neg

  def sub(r: Rational): Rational = add(r.neg)

  def -(r: Rational): Rational = sub(r)

  def mult(r: Rational) =
    new Rational(numer * r.numer, denom * r.denom)

  def *(r: Rational): Rational = mult(r)

  def div(r: Rational) =
    new Rational(numer * r.denom, denom * r.numer)

  def /(r: Rational): Rational = div(r)

  def less(r: Rational): Boolean = numer * r.denom < r.numer * denom

  def <(r: Rational): Boolean = less(r)

  def more(r: Rational): Boolean = numer * r.denom > r.numer * denom

  def >(r: Rational): Boolean = more(r)

  def max(r: Rational): Rational = if (less(r)) r else this

  def min(r: Rational): Rational = if (more(r)) r else this

  def inv: Rational = new Rational(denom, numer)
  def unary_/ : Rational = inv

  override
  def toString: String = numer + "/" + denom
}