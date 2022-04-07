package com.portfolio.apps.outsource.grofastdelivery.di

import androidx.lifecycle.ViewModelProvider
import com.portfolio.apps.outsource.grofastdelivery.ApiRequestCompanion
import com.portfolio.apps.outsource.grofastdelivery.GroFastViewModelFactory
import com.portfolio.apps.outsource.grofastdelivery.data.ApiClient
import com.portfolio.apps.outsource.grofastdelivery.data.GroFastRemoteDataSource
import com.portfolio.apps.outsource.grofastdelivery.model.GroFastDataSource
import com.portfolio.apps.outsource.grofastdelivery.repository.GroFastProductsRepository
import com.portfolio.apps.outsource.grofastdelivery.retrofit.ApiRequest

object Injection {

    private val groceryDataSource: GroFastDataSource = GroFastRemoteDataSource(ApiRequestCompanion)
    private val groceryRepository = GroFastProductsRepository(groceryDataSource)
    private val groceryViewModelFactory = GroFastViewModelFactory(groceryRepository)

    fun providerRepository(): GroFastDataSource {
        return groceryDataSource
    }

    fun provideViewModelFactory(): ViewModelProvider.Factory {
        return groceryViewModelFactory
    }
}