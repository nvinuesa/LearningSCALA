package streams

object tt{
	trait SolutionChecker extends GameDef with Solver with StringParserTerrain {
    /**
     * This method applies a list of moves `ls` to the block at position
     * `startPos`. This can be used to verify if a certain list of moves
     * is a valid solution, i.e. leads to the goal.
     */
    def solve(ls: List[Move]): Block =
      ls.foldLeft(startBlock) { case (block, move) => move match {
        case Left => block.left
        case Right => block.right
        case Up => block.up
        case Down => block.down
      }
    }
  }

  trait Level1 extends SolutionChecker {
      /* terrain for level 1*/

      val level =
    """ooo-------
      |oSo-------
      |ooo-------
      |ooT-------""".stripMargin

    val optsolution = List(Right, Right, Down, Right, Right, Right, Down)
  }
	 
	new Level1 {
	  //val a = from(Stream((Block(Pos(1,1),Pos(1,1)),List())),Set())
		//println(from(Stream((Block(Pos(1,1),Pos(1,1)),List()),(Block(Pos(2,1),Pos(3,1)),List(Down))),Set()).toList.toString)
		//println(a.toList.toString)
		//println(goal.toString)
		//println(pathsFromStart.toList.map(_._1).toString)
		//println(goal.toString)
		//println(pathsFromStart.toList.toString)
		//println(solution.toList.toString)
		println(solution.toList.toString)
	}                                         //> List(Down, Right, Up, Left, Down, Down, Right)
                                                  //| res0: streams.tt.Level1 = streams.tt$$anonfun$main$1$$anon$1@52621f0c
}