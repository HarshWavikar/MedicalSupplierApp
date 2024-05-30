package com.codewithharsh.medicalsupplier.presentation.Users

import androidx.lifecycle.ViewModel
import com.codewithharsh.medicalsupplier.domain.usecase.GetUsersUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UsersViewModel @Inject constructor(private val useCase: GetUsersUseCase): ViewModel() {

}