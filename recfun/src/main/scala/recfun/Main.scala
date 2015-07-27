package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c==0 || c==r) 1    
    else pascal(c-1, r-1) + pascal(c,r-1)      
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def loop(c: List[Char], acc: Int): Int = {
      if (c.isEmpty) acc
      else if (acc < 0) acc
      else {
        if (c.head == '(') loop(c.tail, acc+1) 
        else if (c.head == ')') loop(c.tail, acc-1)
        else loop(c.tail, acc)
      }    
    }  
    if (loop(chars,0) == 0) true
    else false
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
     if(money==0) 0 else
     coins match {
        case Nil if(money>0) => 0
        case m :: ms if(money>m) => countChange(money-m, coins) + countChange(money,ms)
        case m :: ms if(money==m) => 1 + countChange(money,ms) 
        case m :: ms if(money<m) => countChange(money, ms)
      }
  }
}
