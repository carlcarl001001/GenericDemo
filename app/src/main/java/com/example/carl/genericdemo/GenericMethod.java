package com.example.carl.genericdemo;

public class GenericMethod {
    //泛型方法的泛型是加在返回值类型前面
    public <T,E> void method(T t){
        System.out.println(t);
    }
}
