package com.toricor.hello.service

import org.springframework.stereotype.Service

@Service
class HelloService {
    fun getHello() = "Hello service!"
}