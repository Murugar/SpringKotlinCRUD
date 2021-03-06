package com.iqmsoft.dao

import com.iqmsoft.model.Customer
import org.springframework.data.repository.CrudRepository


interface CustomerRepository : CrudRepository<Customer, Long> {
    fun findByLastName(lastName: String): MutableIterable<Customer>

}