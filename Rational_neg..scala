object Neg extends App{
  val r=new Rational_neg(2,4)

  val x=r.neg
  println(r)

  println(x)
}

class Rational_neg(n:Int,d:Int){

  def numer=n/gcd(n,d)
  def denom=d/gcd(n,d)
  private def gcd(a:Int,b:Int):Int=if(b==0) a else gcd(b,a%b)

  def neg = new Rational_neg(-this.numer,this.denom)


  override def toString=numer+"/"+denom
}
