package funsets

object xork {
	import funsets.List
  println("Welcome to the Scala worksheet")
  
  val l = new Nil
  
  l.isEmpty
  
  l.tail
  
  def singlelist[T](elem: T) = new Cons[T](elem, new Nil[T])
}