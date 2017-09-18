package com.toricor.hello.controller

import com.toricor.hello.entity.Customer
import com.toricor.hello.service.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/customers")
class CustomerController {

    @Autowired
    lateinit var customerService: CustomerService

    @GetMapping
    fun getCustomers(): List<Customer> =
            customerService.findAll()

    @GetMapping("{id}")
    fun getCustomer(@PathVariable id: Int): Customer =
            customerService.findOne(id)

    @GetMapping("/search")
    fun getCustomersByFirstName(@RequestParam firstName: String): List<Customer> =
            customerService.findByFirstName(firstName)

    // インサートはOKしかし500 Error
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createCustomer(@RequestBody customer: Customer): Customer =
            customerService.create(customer)

    @PostMapping("{id}")
    fun updateCustomer(@PathVariable id: Int, @RequestBody customer: Customer): Customer {

        return customerService.update(customer)
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteCustomer(@PathVariable id: Int) {
        customerService.delete(id)
    }


}