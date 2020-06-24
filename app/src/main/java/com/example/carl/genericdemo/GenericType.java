package com.example.carl.genericdemo;
/**
 * 泛型的定义
 * 泛型是加在类型名后面
 * <>里面的东西是泛型的形参
 * T就是泛型的形参名称
 * 通常泛型形参都是一个大写字母.T，E
 * 泛型可以同时定义多个，多个之间用“，”隔开
* */
public class GenericType<T> {
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
