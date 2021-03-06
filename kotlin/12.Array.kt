package com.example.myapplication.kotlin

// 배열이 필요한 이유

fun main(array: Array<String>) {
    val one: Int = 1
    val two: Int = 2
    val three: Int = 3
    val four: Int = 4
    val five: Int = 5

    // 배열을 생성하는 방법(1)
    var group1 = arrayOf<Int>(1,2,3,4,5)
    println(group1 is Array)

    // 배열을 생성하는 방법(2)
    // 자동으로
    var group2 = arrayOf(1,2,3.5,"Hello")
    println(group2.get(1))

    // Index
    // 배열의 값을 꺼내는 방법(1)
    val test1 = group1.get(0)
    val test2 = group1.get(4)
    println(test1)
    println(test2)

    val test3 = group1[0]
    println(test3)

    group1.set(0,100)
    println(group1[0])
}