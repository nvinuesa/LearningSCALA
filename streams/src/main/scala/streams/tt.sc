package streams

object tt {
	val v = Vector(Vector('-','-','-'),Vector('o','s','-'),Vector('o','-','-'))
                                                  //> v  : scala.collection.immutable.Vector[scala.collection.immutable.Vector[Cha
                                                  //| r]] = Vector(Vector(-, -, -), Vector(o, s, -), Vector(o, -, -))
  v.indexOf(Vector('o','s','-'))                  //> res0: Int = 1
  v(1) contains 'z'                               //> res1: Boolean = false
  v(v indexWhere (_ contains('s'))).indexOf('s')  //> res2: Int = 1
}