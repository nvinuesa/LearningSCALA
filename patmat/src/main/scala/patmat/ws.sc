package patmat



object polynomials {
	class poly(val terms0: Map[Int, Double]) {
		def this(bindings: (Int, Double)*) = this(bindings.toMap)
		val terms = terms0 withDefaultValue 0.0
		//def + (other: poly) = new poly(terms ++ (other.terms map adjust))
		def + (other: poly) = new poly((other.terms foldLeft terms)(addTerm))
		def addTerm(terms: Map[Int, Double], term: (Int, Double)): Map[Int, Double] = {
			val (exp, coeff) = term
			terms + (exp -> (coeff + terms(exp)))
		}
		override def toString =
			(for ((exp,coeff) <- terms.toList.sorted.reverse) yield coeff+"x^"+exp) mkString " + "
	}

	val a = new poly(1 -> 2, 3 -> 4, 5 -> 6.2)//> a  : patmat.polynomials.poly = 6.2x^5 + 4.0x^3 + 2.0x^1
	val b = new poly(0 -> 3, 3 -> 7)          //> b  : patmat.polynomials.poly = 7.0x^3 + 3.0x^0
	val c = a + b                             //> c  : patmat.polynomials.poly = 6.2x^5 + 11.0x^3 + 2.0x^1 + 3.0x^0
}