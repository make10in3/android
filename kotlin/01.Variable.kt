package com.example.myapplication.kotlin

var num = 10
var hello = "hello"
var point = 3.4
val fix = 20

fun main(args:Array<String>) {

    println(num)
    println(hello)
    println(point)
    println(fix)

    num=10
    hello="Good Bye"
    point=10.4

    println(num)
    println(hello)
    println(fix)
    println(point)

    //fix=500 // error
}