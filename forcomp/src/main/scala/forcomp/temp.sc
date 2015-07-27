package forcomp

import math._
import scala.util._

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
object temp {
		val readInt = 5
		val readLine = List(3, -2, -8, -1, 5)
    val n = readInt // the number of temperatures to analyse
    val temps = readLine // the N temperatures expressed as integers ranging from -273 to 5526
    
    // Write an action using println
    // To debug: Console.err.println("Debug messages...")
    
    temps.map(abs(_)).min
    
    n match {
        case 0 => println(0)
        case x if x > 9999 => Console.err.println("srr")
        case _ =>
    }
}