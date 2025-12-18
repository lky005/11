cmake_minimum_required(VERSION 3.10)

project(MyLib)

# --- 核心修复开始 ---
# 获取环境变量中的 JAVA_HOME
set(JAVA_HOME $ENV{JAVA_HOME})

if(NOT JAVA_HOME)
    message(WARNING "JAVA_HOME environment variable is not set! JNI headers might be missing.")
else()
    message(STATUS "Found JAVA_HOME: ${JAVA_HOME}")
    # 将 JDK 的头文件目录加入编译搜索路径
    include_directories(${JAVA_HOME}/include)
    include_directories(${JAVA_HOME}/include/linux)
endif()
# --- 核心修复结束 ---

add_library(
    mylib
    SHARED
    native_lib.cpp
)

target_link_libraries(
    mylib
)