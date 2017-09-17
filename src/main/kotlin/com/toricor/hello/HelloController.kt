package com.toricor.hello

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("hello")
class HelloController {

    @GetMapping("/string")
    fun helloString(): String {
        return "Hello string!"
    }

    @Autowired
    lateinit var helloService: HelloService

    @GetMapping("/service")
    fun demoService() = helloService.getHello()

    @GetMapping("/data")
    fun helloData() = Hello("Hello data!")
}