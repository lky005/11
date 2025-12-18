cmake_minimum_required(VERSION 3.10)

project(MyLib)

add_library(
    mylib
    SHARED
    native_lib.cpp
)

target_link_libraries(
    mylib
)