package com.iqmsoft.controller

import com.iqmsoft.model.Customer
import com.iqmsoft.service.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod


@Controller
@RequestMapping("/customer")
class CustomerController {
    @Autowired
    lateinit var customerService: CustomerService

    @RequestMapping("/add")
    fun addForm(): String = "form"

    @RequestMapping(value = "save", method = arrayOf(RequestMethod.POST))
    fun saveCustomer(customer: Customer): String {
        customerService.save(customer)

        return "redirect:/"
    }
}