cmake_minimum_required(VERSION 3.4.1)

project(MyLib)

add_library(
    mylib
    SHARED
    native_lib.cpp
)

target_link_libraries(
    mylib
)
