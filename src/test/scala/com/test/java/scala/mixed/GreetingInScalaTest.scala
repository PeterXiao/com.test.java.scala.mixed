package com.test.java.scala.mixed


import com.test.java.scala.mixed.GreetingInScala
import org.junit.{Assert, Test}
import org.scalatest.{FunSpec, Matchers}

// Artist类有两个属性 firstNam表示名字 和 lastName姓氏
class Artist(val firstName: String, val lastName: String)

// Album 有三个属性 title表示专辑名称 year表示发行年份 artist表示专辑作者
class Album(val title: String, val year: Int, val artist: Artist)


class AlbumTest extends FunSpec with Matchers {
  describe("An Album") {
    it("can add an Artist object to the album") {
      val album = new Album("Thriller", 1981, new Artist("Michael", "Jackson"))
      album.artist.firstName should be("Michael")
    }
  }
}

@Test
class GreetingInScalaTest   extends Assert {

 @Test
  def hel:Unit = {
    val someValue = true
    assert(someValue == true)
    println("test");
    
  }
 
 

  
}

// scalatest
//class GreetingInScalaTest extends FunSuite{
//    test("An empty Set should have size 0") {
//    assert(Set.empty.size == 0)
////    GreetingInScala scalatest =new GreetingInScala();
//  }
//
//  test("Invoking head on an empty Set should produce NoSuchElementException") {
//    assertThrows[NoSuchElementException] {
//      Set.empty.head
//    }
//  }
//  
//  
//}