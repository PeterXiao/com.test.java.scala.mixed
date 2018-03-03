package com.test.java.scala.mixed

class GreetingInScala {
  def greet: Unit = {
    val delegate: GreetingInJava = new GreetingInJava
    delegate.greet
  }
}