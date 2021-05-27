package com.example.myapplication.kotlin

fun main(args: Array<String>){
    val superCar100 : SuperCar100 = SuperCar100()
    println(superCar100.drive())
    superCar100.stop()

    val bus100: Bus100 = Bus100()
    bus100.drive()
}

// 기본 접근 제어자 : private
// not private : open
open class Car100{
    open fun drive() : String{
        return "달린다"
        //println("달린다")
    }

    fun stop(){

    }

}

class SuperCar100():Car100(){
    override fun drive() : String{
        var run = super.drive()
        return "빨리 $run"
    }
}

class Bus100(): Car100(){

}