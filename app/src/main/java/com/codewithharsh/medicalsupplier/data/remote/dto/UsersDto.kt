package com.codewithharsh.medicalsupplier.data.remote.dto

import com.google.gson.annotations.SerializedName

data class UsersDto(
    val address: String,
    val approved: Int,
    val blocked: Int,
    val dateOfAccountCreation: String,
    val email: String,
    @SerializedName("gst_number")
    val gstNumber: String,
    val id: Int,
    val level: Int,
    val name: String,
    val password: String,
    val phone: String,
    val pincode: String,
    @SerializedName("user_id")
    val userId: String
)