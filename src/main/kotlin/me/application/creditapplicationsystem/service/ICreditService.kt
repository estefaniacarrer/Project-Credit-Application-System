package me.application.creditapplicationsystem.service

import me.application.creditapplicationsystem.entity.Credit
import java.util.*

interface ICreditService {

    fun save(credit: Credit): Credit

    fun findAllByCustomer(customerId: Long): List<Credit>

    fun findByCreditCode(customerId: Long, creditCode: UUID): Credit
}