package com.portfolio.apps.outsource.grofastdelivery.model

import com.portfolio.apps.outsource.grofast.fragment.GroFastItem
import com.portfolio.apps.outsource.grofastdelivery.data.OperationCallback

interface GroFastDataSource {
    suspend fun retrieveGroFastItems(callback: OperationCallback<GroFastItem>)
    fun cancel();
}