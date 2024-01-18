package me.application.creditapplicationsystem.dto

import jakarta.validation.constraints.Future
import jakarta.validation.constraints.NotNull
import me.application.creditapplicationsystem.entity.Credit
import me.application.creditapplicationsystem.entity.Customer
import java.math.BigDecimal
import java.time.LocalDate

data class CreditDto(
    @field:NotNull(message = "Invalid input")
    val creditValue: BigDecimal,
    @field:Future
    val dayFirstOfInstallment: LocalDate,
    val numberOfInstallments: Int,
    @field:NotNull(message = "Invalid input")
    val customerId: Long

    ) {

    fun toEntity(): Credit = Credit(
        creditValue = this.creditValue,
        dayFirstInstallment = this.dayFirstOfInstallment,
        numberOfInstallments = this.numberOfInstallments,
        customer = Customer(id = this.customerId)

    )

}
