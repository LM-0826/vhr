package com.lagou.dynamicProxy;

/**
 * @author: 李明
 * @create: 2020-02-29 9:18
 * @Description:
 */
public class Bob implements Person {
    @Override
    public void doSomething() {
        System.out.println("Bob doing something!");
    }
}
