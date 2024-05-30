package com.codewithharsh.medicalsupplier.data.remote.mapper

import com.codewithharsh.medicalsupplier.data.remote.dto.UsersDto
import com.codewithharsh.medicalsupplier.domain.model.Users

// Open Close Principle : Open for extension but closed for modification
fun UsersDto.toUsers(): Users {
    return Users(
        id = id,
        userId = userId,
        name = name,
        email = email,
        password = password,
        phone = phone,
        pincode = pincode,
        address = address,
        gstNumber = gstNumber,
        dateOfAccountCreation = dateOfAccountCreation,
        approved = approved,
        blocked = blocked,
        level = level
    )
}