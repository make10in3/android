package com.example.myapplication.kotlin

fun main(args:Array<String>) {

    // 변경할 수 없는 콜렉션 Immutable Collection
    // List -> 중복을 허용한다
    val numberList = listOf<Int>(1,2,3)
    println(numberList)
    println(numberList.get(0))
    println(numberList[0])


    // Set -> 중복을 허용하지 않는다
    // 순서가 없다
    val numberSet = setOf<Int>(1,2,3,3,3)
    println(numberSet)
    numberSet.forEach{
        println(it)
    }
    // Map -> Key, Value 방식으로 관리한다
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println()
    println(numberMap.get("one"))

    // 변경할수 있는 콜렉션 Mutable Collection
    val mNumberList = mutableListOf<Int>(1,2,3)
    mNumberList.add(3, 4)
    println()
    println(mNumberList)

    val mNumberSet = mutableSetOf<Int>(1,2,3,4,4,4)
    mNumberSet.add(10) // 인덱스 필요없음
    println(mNumberSet)

    val mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("two", 2)
    println(mNumberMap)

}