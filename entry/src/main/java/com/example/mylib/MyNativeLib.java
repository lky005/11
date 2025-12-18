package com.example.mylib;

public class MyNativeLib {
    // 加载名为 "mylib" 的动态库
    static {
        System.loadLibrary("mylib");
    }

    // 声明 native 方法
    public native String stringFromJNI();
}
