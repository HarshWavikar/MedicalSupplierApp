package com.codewithharsh.medicalsupplier.domain.usecase

import com.codewithharsh.medicalsupplier.domain.repository.MedicalRepository
import javax.inject.Inject

class GetUsersUseCase @Inject constructor(private val repository: MedicalRepository) {
     operator fun invoke() = repository.getAllUsers()
}