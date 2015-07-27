package objsets

object tweets {
	import objsets._
	
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
/*
  val t1: Tweet = new Tweet("nico", "lepra 1", 1000)
  val t2: Tweet = new Tweet("nico", "lepra 2", 5)
  val t3: Tweet = new Tweet("nic", "lepra 3", 3)
  val t4: Tweet = new Tweet("nico", "lepra 4", 150)
  val set: Empty = new Empty

  val s1 = set.incl(t1)
  val s2 = s1.incl(t4)
  val s3 = s2.incl(t2)
  val s4 = s3.incl(t3)

  println(t1.toString)
  s4.contains(t1)

  // s4.foreach(x => println(x.toString))

  val resFilter = s4.filter(x => x.retweets > 1)
  // resFilter.foreach(x => println(x.toString))

  val t5: Tweet = new Tweet("nob", "tata martino", 15)
  val t6: Tweet = new Tweet("nob", "yaya rossi", 100)
  val t7: Tweet = new Tweet("parlante", "soy sinaliento", 0)

  val s21 = set.incl(t5)
  val s22 = s21.incl(t6)
  val s23 = s22.incl(t7)

  //  s23.foreach(x => println(x.toString))

  val unset = s4 union s23
  // unset.foreach(x => println(x.toString))
  val tw: Tweet = unset.mostRetweeted
  val dsList: TweetList = unset.descendingByRetweet
  */
  // dsList.foreach(x => println(x.toString))
  val zz = TweetReader.allTweets                  //> java.lang.NoClassDefFoundError: objsets/TweetReader$
                                                  //| 	at objsets.tweets$$anonfun$main$1.apply$mcV$sp(objsets.tweets.scala:43)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at objsets.tweets$.main(objsets.tweets.scala:4)
                                                  //| 	at objsets.tweets.main(objsets.tweets.scala)
                                                  //| Caused by: java.lang.ClassNotFoundException: objsets.TweetReader$
                                                  //| 	at java.net.URLClassLoader$1.run(URLClassLoader.java:366)
                                                  //| 	at java.net.URLClassLoader$1.run(URLClassLoader.java:355)
                                                  //| 	at java.security.AccessController.doPrivileged(Native Method)
                                                  //| 	at java.net.URLClassLoader.findClass(URLClassLoader.java:354)
                                                  //| 	at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
                                                  //| 	at sun
                                                  //| Output exceeds cutoff limit.
                 
  
}