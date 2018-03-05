package com.test.java.scala.mixed;

import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class testTest {
    @Test
    public void test2(Method method) throws Exception {
        System.out.println("test2");
    }

    @Test(dependsOnMethods = "test2")
    public void test3(Method method) throws Exception {
        System.out.println("test3");
    }

    @Test(dependsOnMethods = "test3")
    public void test4(Method method) throws Exception {
        System.out.println("test4");
    }
}
