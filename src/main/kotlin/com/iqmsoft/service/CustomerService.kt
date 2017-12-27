package com.iqmsoft.service

import com.iqmsoft.dao.CustomerRepository
import com.iqmsoft.model.Customer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service
@Transactional(readOnly = true)
class CustomerService {
    @Autowired
    lateinit var customerReposity: CustomerRepository

    @Transactional
    fun save(customer: Customer) = customerReposity.save(customer)

    fun findAll(): MutableIterable<Customer>? = customerReposity.findAll();

}