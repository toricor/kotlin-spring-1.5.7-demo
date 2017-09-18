package com.toricor.hello.service

import com.toricor.hello.entity.Customer
import com.toricor.hello.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerService {

    @Autowired
    lateinit var customerRepository: CustomerRepository

    fun findAll(): List<Customer> {
        customerRepository.findAll()
    }

    fun findOne(val id: Int): Customer {
        customerRepository.findOne(id)
    }

    fun findByFirstName(val firstName: String): List<Customer> {
        customerRepository.findByFirstName(firstName)
    }

    fun create(val customer: Customer): Customer {
        customerRepository.insert(customer)
        return customer
    }

    fun update(val customer: Customer): Customer {
        customerRepository.update(customer)
        return customer
    }

    fun delete(val id: Int) {
        customerRepository.delete(id)
    }

}