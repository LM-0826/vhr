package com.lagou.dynamicProxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: 李明
 * @create: 2020-02-29 9:20
 * @Description:
 */
public class JDKDynamicProxy implements InvocationHandler {

    Person target;

    public JDKDynamicProxy(Person person) {
        this.target = person;
    }

    public Person getTarget() {
        return (Person) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("JDKDynamicProxy do something before!");
        Object invoke = method.invoke(target, args);
        System.out.println("JDKDynamicProxy do something after!");
        return invoke;
    }
}
