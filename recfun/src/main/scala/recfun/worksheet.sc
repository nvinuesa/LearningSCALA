package recfun

object worksheet {
  def product(f:Int => Int)(a: Int, b: Int):Int =
  	if (a>b) 1 else f(a) * product(f)(a+1,b)  //> product: (f: Int => Int)(a: Int, b: Int)Int
  product(x=>x)(1,3)                              //> res0: Int = 6
  
  def fact(x:Int):Int =
  	product(x=>x)(1,x)                        //> fact: (x: Int)Int
  fact(5)                                         //> res1: Int = 120
  
}