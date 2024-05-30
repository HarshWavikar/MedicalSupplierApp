package com.codewithharsh.medicalsupplier.domain.repository

import com.codewithharsh.medicalsupplier.core.common.Resource
import com.codewithharsh.medicalsupplier.domain.model.Users
import kotlinx.coroutines.flow.Flow

interface MedicalRepository {

    fun getAllUsers(): Flow<Resource<List<Users>>>
}