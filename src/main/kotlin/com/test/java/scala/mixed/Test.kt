package com.test.java.scala.mixed

import org.testng.ITestContext
import org.testng.ITestResult
import org.testng.SkipException
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

fun main(args: Array<String>) {    // 包级可见的函数，接受一个字符串数组作为参数
    println("Hello World!")         // 分号可以省略
}

@Test(description = "http")
fun  mainTest(){

}
