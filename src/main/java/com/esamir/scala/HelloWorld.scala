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
  def factorialPlay(): Unit = {
    //java
    var start: Long = System.currentTimeMillis()
    println("the factorial of 30 via java: " + factorial(BigInteger.valueOf(30L)))
    var end: Long = System.currentTimeMillis()
    println(s"It took ${end - start} milliseconds to calculate fact(30) in java")

    //Scala
    start = System.currentTimeMillis()
    println("the factorial of 30 via scala: " + factorialScala(BigInteger.valueOf(30L)))
    end = System.currentTimeMillis()
    println(s"It took ${end - start} milliseconds to calculate fact(30) in scala")
  }


  def main(args: Array[String]): Unit = {
    println("Hello World!")
    //Maps
    var capital = Map("US" -> "Washington", "France" -> "Paris")
    capital += ("Japan" -> "Tokyo")
    println(capital)

    factorialPlay()

    //Class fun time.
    var dummy:Dummy = new Dummy(1, "foobar")




  }
}