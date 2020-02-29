package com.lagou.dynamicProxy;

import org.junit.Test;

/**
 * @author: 李明
 * @create: 2020-02-29 9:30
 * @Description:
 */
public class JDKDynamicTest {

    @Test
    public void test() {
        Person person = new Bob();
        person.doSomething();

        System.out.println("=======================");

        Person person1 = new JDKDynamicProxy(new Bob()).getTarget();
        person1.doSomething();
    }
}
