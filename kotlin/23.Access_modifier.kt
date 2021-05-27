package com.example.myapplication.kotlin

fun main(array: Array<String>){
    val testAccess: TestAccess = TestAccess("아무개")

    // private 키워드 떄문에 외부에서 접근 불가능
    //testAccess.test()
    //println(testAccess.name)
    //testAccess.name = "아무개 투"
    //println(testAccess.name)

    val runningCar: RunningCar = RunningCar()
    runningCar.runFast()
}

class TestAccess{
    private var name:String = "홍길동"

    constructor(name:String){
        this.name = name
    }

    private fun test(){
        println("테스트")
    }
}

class RunningCar(){

    fun runFast(){
        run()
    }

    private fun run(){
        println("private run()")
    }
}