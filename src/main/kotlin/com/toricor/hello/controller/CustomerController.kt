package com.toricor.hello.controller

import com.toricor.hello.service.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("customers")
class CustomerController {

    @Autowired
    lateinit var customerService: CustomerService

    @GetMapping()
    fun getCustomers() {
        return customerService.findAll
    }
}