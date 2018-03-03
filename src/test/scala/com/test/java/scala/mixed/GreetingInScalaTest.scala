package com.test.java.scala.mixed

import org.scalatest.FunSuite
import com.test.java.scala.mixed.GreetingInScala

class GreetingInScalaTest extends FunSuite{
    test("An empty Set should have size 0") {
    assert(Set.empty.size == 0)
//    GreetingInScala scalatest =new GreetingInScala();
  }

  test("Invoking head on an empty Set should produce NoSuchElementException") {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }
  
  
}