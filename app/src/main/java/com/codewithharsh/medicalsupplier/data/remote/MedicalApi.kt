package com.codewithharsh.medicalsupplier.data.remote

import com.codewithharsh.medicalsupplier.data.remote.dto.UsersDto
import retrofit2.http.GET

interface MedicalApi {

    @GET("getallusers")
    suspend fun getAllUsers(): List<UsersDto>
}