package com.codewithharsh.medicalsupplier.domain.model

import com.google.gson.annotations.SerializedName

data class Users(
    val id: Int,
    val userId: String,
    val name: String,
    val email: String,
    val password: String,
    val phone: String,
    val pincode: String,
    val address: String,
    val gstNumber: String,
    val dateOfAccountCreation: String,
    val approved: Int,
    val blocked: Int,
    val level: Int
)