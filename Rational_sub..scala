object Neg extends App{
  val x=new Rational_sub(32,4)
  val y=new Rational_sub(4,4)
  val z=new Rational_sub(8,4)

  val q=x.sub(y).sub(z)


  print("Entered rational numbers: ")
  println(x)
  println(y)
  println(z)

  print("X-Y-Z: ")
  println(q)
}

class Rational_sub(n:Int,d:Int){

  def numer=n/gcd(n,d)
  def denom=d/gcd(n,d)
  private def gcd(a:Int,b:Int):Int=if(b==0) a else gcd(b,a%b)

  def sub(r:Rational_sub)=new Rational_sub(this.numer*r.denom-this.denom*r.numer,this.denom*r.denom)


  override def toString=numer+"/"+denom
}
