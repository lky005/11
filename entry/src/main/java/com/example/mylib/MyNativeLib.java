// package com.example.mylib;
//
// public class MyNativeLib {
    加载名为 "mylib" 的动态库
//     static {
//         System.loadLibrary("mylib");
//     }
//
    声明 native 方法
//     public native String stringFromJNI();
// }
// 第一行是你的包名，不要改，保持原样！
package com.example.myapplication;

// 1. 【新增】这里引入你刚才通过 JAR 包加进来的库
import com.example.mylib.MyNativeLib;

import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class MainAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);

        // --- 2. 【新增】测试代码写在这里 ---
        try {
            System.out.println("=== 开始测试我的 Native 库 ===");

            // 实例化你的库
            MyNativeLib lib = new MyNativeLib();

            // 调用 C++ 方法
            String result = lib.stringFromJNI();

            // 打印结果
            System.out.println("=== 成功啦！C++ 说: " + result);

        } catch (UnsatisfiedLinkError e) {
            // 如果报错找不到 so 库，会打印这个
            System.err.println("=== 失败！找不到 SO 库，请检查 libs/arm64-v8a 文件夹放对了没 ===");
            e.printStackTrace();
        } catch (NoClassDefFoundError e) {
            // 如果报错找不到类，会打印这个
            System.err.println("=== 失败！找不到 JAR 包，请检查有没有右键 Add as Library ===");
        }
        // ----------------------------------
    }
}