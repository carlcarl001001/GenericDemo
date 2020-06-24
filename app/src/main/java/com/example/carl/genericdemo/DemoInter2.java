package com.example.carl.genericdemo;
//泛型接口的类型由DemoInter2类来传递
public class DemoInter2<T,E> implements GenericInter<T,E> {
    @Override
    public void method(T t) {

    }

    @Override
    public void method2(E e) {

    }
}
