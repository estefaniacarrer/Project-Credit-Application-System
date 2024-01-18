package me.application.creditapplicationsystem.service.impl

import me.application.creditapplicationsystem.entity.Customer
import me.application.creditapplicationsystem.exception.BusinessException
import me.application.creditapplicationsystem.repository.CustomerRepository
import me.application.creditapplicationsystem.service.ICustomerService
import org.springframework.stereotype.Service
import java.lang.RuntimeException

@Service
class CustomerService(
    private val customerRepository: CustomerRepository
) : ICustomerService {

    override fun save(customer: Customer): Customer =
        this.customerRepository.save(customer)


    override fun findById(id: Long): Customer =
        this.customerRepository.findById(id)
            .orElseThrow() {
                throw BusinessException("Id $id not found")

            }

    override fun delete(id: Long) {
        val customer: Customer = this.findById(id)
        this.customerRepository.delete(customer)
    }

}