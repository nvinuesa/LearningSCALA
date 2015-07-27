package forcomp

object wc {
	def from(n: Int): Stream[Int] = n #:: from(n+1)
                                                  //> from: (n: Int)Stream[Int]
   
  val nats = from(0)                              //> nats  : Stream[Int] = Stream(0, ?)
 
 	val m4 = nats.filter(_ % 2 == 0)          //> m4  : scala.collection.immutable.Stream[Int] = Stream(0, ?)
}