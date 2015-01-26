package com.esamir.scala

import java.math.BigInteger

/**
 * Created by user on 1/25/15.
 */
object HelloWorld {


  //scala version
  def factorialScala(x: BigInt): BigInt = {
    if (x == 0) 1 else x * factorialScala(x - 1)
  }


  //java version
  def factorial(x: BigInteger): BigInteger = {
    if (x == BigInteger.ZERO) {
      return BigInteger.ONE
    } else {
      return x.multiply(factorial(x.subtract(BigInteger.ONE)));
    }
  }


  // Runner methods
  def factorialPlay(target: Long ): Unit = {
    //java
    var start: Long = System.currentTimeMillis()
    val target:Long = 100L  // Interesting.  This overrides method parameter
    println(s"the factorial of ${target} via java: ${factorial(BigInteger.valueOf(target))}")
    var end: Long = System.currentTimeMillis()
    println(s"It took ${end - start} milliseconds to calculate fact(${target}) in java")

    //Scala
    start = System.currentTimeMillis()
    println(s"the factorial of ${target} via java: ${factorialScala(BigInteger.valueOf(target))}")
    end = System.currentTimeMillis()
    println(s"It took ${end - start} milliseconds to calculate fact(${target}) in scala")
  }

  def dataTypes(): Unit = {
    //Arrays
    val greeting = new Array[String](3)
    val anotherArray = Array("OMG", "Like", "Hi!!!")
    greeting(0) = "Hello"
    greeting(1) = "World"
    greeting(2) = "!!!"

    //Another variation of the same code

    //so pretty
    greeting.foreach(i=> print(s"${i} "))

    for(i <- 0.to(2)) {
      print(s"${greeting(i)} ")
    }
    print("\n")
    for(i <- 0 to 2 ) {
      print(s"${greeting(i)} ")
    }
    print("\n")
    for(i <- 0 to anotherArray.length - 1) {
      print(anotherArray(i))

    }
    //List
    print("\n")
    val list = List(7, 9, 3)
    //prepend an element and return a new list.
    val modifiedList = 1 :: list

//    for (i <- 0 to modifiedList.length - 1) {
//        print(s"${modifiedList(i)} ")
//    }

    print("\n")
    val mergedList = list ::: modifiedList
    print(mergedList)
    print("\n")
    print( mergedList.count(p => p == 7  )  )

    mergedList.foreach(f=> println(f))
    //Removes duplicates, sorts and prints.
    mergedList.distinct.sortWith((s, t) => s < t ).
      foreach(i => print(s"${i} "))
    //Tuples
    val pair = (5, "Hi")
    print(s"\n${pair}\n")
    println(pair._1)
    println(pair._2)
    //Set
   var aSet = Set(5, 2,9)
    print(s"\n${aSet}\n")
    aSet  += 42
    print(aSet.contains(42))
    val mutableSet = scala.collection.mutable.Set(5,2,9)
    print(s"\n${mutableSet}\n")
    mutableSet += 42
    print(mutableSet.contains(42))
    //map
    val aMap = Map("first" -> 1,  "second" ->2)
    print(aMap)
    print(aMap.apply("first"))
//    print(aMap.apply("ffffirst"))
  }


  def main(args: Array[String]): Unit = {
    println("Hello World!")
    //Maps
    var capital = Map("US" -> "Washington", "France" -> "Paris")
    capital += ("Japan" -> "Tokyo")
    println(capital)

//    factorialPlay(50L)
    dataTypes()

    //Class fun time.
    var dummy:Dummy = new Dummy(1, "foobar")

  }
}