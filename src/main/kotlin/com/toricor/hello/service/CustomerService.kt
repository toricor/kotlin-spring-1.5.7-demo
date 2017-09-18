package com.toricor.hello.service

import com.toricor.hello.entity.Customer
import com.toricor.hello.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerService {

    @Autowired
    lateinit var customerRepository: CustomerRepository

    fun findAll(): List<Customer> =
        customerRepository.findAll()


    fun findOne(id: Int): Customer =
        customerRepository.findOne(id)


    fun findByFirstName(firstName: String): List<Customer> =
        customerRepository.findByFirstName(firstName)


    fun create(customer: Customer): Customer {
        customerRepository.insert(customer)
        return customer
    }

    fun update(customer: Customer): Customer {
        customerRepository.update(customer)
        return customer
    }

    fun delete(id: Int) {
        customerRepository.delete(id)
    }

}