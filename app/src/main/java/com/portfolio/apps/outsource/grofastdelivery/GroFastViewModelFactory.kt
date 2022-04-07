package com.portfolio.apps.outsource.grofastdelivery

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.portfolio.apps.outsource.grofastdelivery.repository.GroFastProductsRepository
import com.portfolio.apps.outsource.grofastdelivery.viewmodel.GroFastProductsViewModel

class GroFastViewModelFactory(private val repository: GroFastProductsRepository) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return GroFastProductsViewModel(repository) as T
    }
}