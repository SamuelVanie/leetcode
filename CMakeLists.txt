cmake_minimum_required(VERSION 3.10)
project(leetcode)

enable_testing()

find_package(GTest REQUIRED)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_BUILD_TYPE Debug)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(SRC ${PROJECT_SOURCE_DIR}/src)
set(TEST ${PROJECT_SOURCE_DIR}/tests)

include_directories(${PROJECT_SOURCE_DIR}/include)

add_executable(merge_sort_array_test
        ${SRC}/merge_sort_array.cpp
        ${TEST}/merge_sort_array_test.cpp
        )
        
target_link_libraries(merge_sort_array_test GTest::gtest GTest::gtest_main)
add_test(NAME merge_sort_array_test COMMAND merge_sort_array_test)
