package com.codewithharsh.medicalsupplier.data.repository

import com.codewithharsh.medicalsupplier.core.common.Resource
import com.codewithharsh.medicalsupplier.data.remote.MedicalApi
import com.codewithharsh.medicalsupplier.data.remote.mapper.toUsers
import com.codewithharsh.medicalsupplier.domain.model.Users
import com.codewithharsh.medicalsupplier.domain.repository.MedicalRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject


class MedicalRepositoryImpl @Inject constructor(
    private val medicalApi: MedicalApi
) : MedicalRepository {

    override fun getAllUsers(): Flow<Resource<List<Users>>> = flow {
        emit(Resource.Loading())
        try {
            val result = medicalApi.getAllUsers().map {
                it.toUsers()
            }
            emit(Resource.Success(result))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Error"))
        }
    }.flowOn(Dispatchers.IO)
        .catch {
            emit(Resource.Error(it.message ?: "Error"))
        }
}