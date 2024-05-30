package com.codewithharsh.medicalsupplier.di

import com.codewithharsh.medicalsupplier.core.util.Constants.BASE_URL
import com.codewithharsh.medicalsupplier.data.remote.MedicalApi
import com.codewithharsh.medicalsupplier.data.repository.MedicalRepositoryImpl
import com.codewithharsh.medicalsupplier.domain.repository.MedicalRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideMedicalAp(retrofit: Retrofit): MedicalApi {
        return retrofit.create(MedicalApi::class.java)
    }

    @Provides
    @Singleton
    fun provideMedicalRepository(medicalApi: MedicalApi): MedicalRepository {
        return MedicalRepositoryImpl(medicalApi)
    }

}