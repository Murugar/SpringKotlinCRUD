package com.iqmsoft.model

import java.io.Serializable
import javax.persistence.*


@Entity
@Table(name = "customer")
data class Customer (
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Int?,
        var firstName: String?,
        var lastName: String?
        ): Serializable{

}