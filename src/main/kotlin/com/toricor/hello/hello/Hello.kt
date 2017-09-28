package com.toricor.hello.hello

data class Hello(val message: String, val hiddenMessage: String = "kotlin now")

class Hoge {
    var param_hoge = 10000
}

class ClassName constructor(val param1: Int, private val param2: String = "initialize") {
    override fun toString() : String {
        return "param1: $param1, param2: $param2"
    }

}