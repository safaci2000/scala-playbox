package com.esamir.scala

import scala.io.Source

object ReadFile {

  def main (args: Array[String]) {

    if(args.length > 0 ) {

      for(line <- Source.fromFile(args(0)).getLines() ) {
        println(line)
      }

    } else {
      Console.err.print("Please enter a filename")
    }


  }

}
