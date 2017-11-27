package com.toricor.hello

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class HelloApplication
// hoge
fun main(args: Array<String>) {
    SpringApplication.run(HelloApplication::class.java, *args)
}
