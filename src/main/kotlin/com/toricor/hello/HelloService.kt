package com.toricor.hello

import org.springframework.stereotype.Service

@Service
class HelloService {
    fun getHello() = "Hello service!"
}