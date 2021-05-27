package com.example.myapplication.kotlin


// -함수를 선언하는 방법
// fun 함수명(변수명 : 타입, 변수명 : 타입 ...) : 반환형 {
//  함수내용
//  return 반환값
// }

fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

// 디폴트 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

// 반환값이 없는 함수 만들기
// Unit - 생략가
fun printPlus(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)
}

fun printPlus2(first: Int, second: Int) {
    val result: Int = first + second
    print(result)
}
// 가변인자를 갖는 함수 선언하는 방법
fun plusMany(vararg numbers: Int){
    for (number in numbers){
        println(number)
    }
}

// - 간단하게 함수를 선언하는 방법
fun plusShort(first: Int, second: Int) = first + second

// 반환 타입이 없는 경우에 Unit 나 생
fun main(array: Array<String>) {
    val result = plus(5, 10)
    println(result)

    val result2 = plus(first = 20, second = 30)
    println(result2)

    val result3 = plus(second = 100, first = 10)
    println(result3)

    println()
    val result4 = plusFive(10)
    println(result4)

    printPlus(10, 20)
    println(plusShort(50, 50))

    println()
    plusMany(1,2,3)
}