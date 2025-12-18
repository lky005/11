#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_mylib_MyNativeLib_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from HarmonyOS (Compiled by GitHub Actions)!";
    return env->NewStringUTF(hello.c_str());
}