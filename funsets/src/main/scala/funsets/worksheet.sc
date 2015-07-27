package funsets

object worksheet {
	import FunSets._
	
	val s: Set = (x: Int) => (x > 0)          //> s  : funsets.FunSets.Set = <function1>
	
	val m: Set = (x: Int) => (x < 5)          //> m  : funsets.FunSets.Set = <function1>
	
	val r = forall(s, (x: Int) => (x > 1) )   //> r  : Boolean = false
	
	printSet(diff(s,m))                       //> {5,6,7,8,9,10}
	
	exists(s,(x: Int) => (x > 9))             //> res0: Boolean = true
	
	def f = (x: Int) => x*2                   //> f: => Int => Int

	val p = map(diff(s,m),f)                  //> p  : funsets.FunSets.Set = <function1>
	
	printSet(p)                               //> {10}
}