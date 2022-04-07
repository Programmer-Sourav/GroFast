package com.portfolio.apps.outsource.grofastdelivery.repository

import com.portfolio.apps.outsource.grofast.fragment.GroFastItem
import com.portfolio.apps.outsource.grofastdelivery.model.GroFastDataSource
import com.portfolio.apps.outsource.grofastdelivery.data.OperationCallback

class GroFastProductsRepository (private val groFastDataSource: GroFastDataSource) {
    suspend fun fetchGroFastItems(callback: OperationCallback<GroFastItem>) {
        groFastDataSource.retrieveGroFastItems(callback)
    }

    fun cancel() {
        groFastDataSource.cancel()
    }
}