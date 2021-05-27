package com.example.myapplication.kotlin


fun main(array: Array<String>){
    // 클래스(설명서)를 통해서 실체를 만드는 방법
    // -> 인스턴스화 -> 인스턴스(객체)
    Car("v8 engine", "big")
    val bigCar = Car("v8 engine", "big")
    val bigCar1: Car = Car("v8 engine", "big") // Car 라는 자료형
    val superCar: SuperCar = SuperCar("good engine", "big", "white")

    // 인스턴스가 가지고 있는 기능을 사용하는 방법
    var runableCar: RunableCar = RunableCar("simple engine", "short body")
    // RunableCar.ride() -> 불가능
    runableCar.ride()
    runableCar.navi("부산")
    runableCar.drive()

    // 인스턴스의 멤버 변수에 접근 하는 방법
    val runableCar2: RunableCar2 = RunableCar2("nice engine", "long body")
    println(runableCar2.body)
    println(runableCar2.engine)

    println()
    val testclass = TestClass()
    testclass.test(1)
    testclass.test(1,2)
}

// 클래스(설명서) 만드는 방법(1)
class Car(var engine : String, var body: String) {

}

// 클래스(설명서) 만드는 방법(2)
class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door:String){
        println(engine)
        println(body)
        println(door)
        this.engine = engine
        this.body = body
        this.door = door
    }
}

// 클래스(설명서) 만드는 방법(3) --> 1번 방법의 확장
class Car1 constructor(engine: String, body: String){
    // 추가
    var door: String =""

    // 생성자
    constructor(engine: String, body: String, door: String): this(engine, body){
        this.door = door
    }
}

// 클래스(설명서) 만드는 방법(4) -> 2번 방법의 확장
class Car2 {
    var engine: String = ""
    var body: String = ""
    var door:String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door:String) {
        this.engine = engine
        this.body = body
        this.door = door
    }

}

class RunableCar(engine: String, body: String){
    fun ride(){
        println("탑승하였습니다.")
    }
    fun drive(){
        println("달립니다.")
    }
    fun navi(destination: String){
        println("$destination 으로 목적지가 설정되었습니다.")
    }

}

class RunableCar2{
    var engine: String
    var body:String

    constructor(engine: String, body: String){
        this.engine = engine
        this.body = body
    }

    init {
        // 초기세팅을 할 때 유용하다
        println("RunableCar2 가 만들어 졌습니다.")
    }

    fun ride(){
        println("탑승하였습니다.")
    }
    fun drive(){
        println("달립니다.")
    }
    fun navi(destination: String){
        println("$destination 으로 목적지가 설정되었습니다.")
    }

}

// 오버로딩
// 이름이 같지만 받는 파라미터가 다른 함수
class TestClass() {

    fun test(a: Int){
        println("up")
    }
    fun test(a: Int, b:Int){
        println("down")
    }
}
