package funsets

trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
  def nth[T](n: Int, L: List[T]): T = {
    def loop[T](e: Int, LL: List[T]): T = {
      if (e == n) LL.head
      else loop(e+1, LL.tail)      
    }
    loop(0,L)
  }
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}

class Nil[T] extends List[T] {
  def isEmpty = true
  def head = throw new NoSuchElementException("no existe guacho head")
  def tail = throw new NoSuchElementException("no existe guacho tail")
}

