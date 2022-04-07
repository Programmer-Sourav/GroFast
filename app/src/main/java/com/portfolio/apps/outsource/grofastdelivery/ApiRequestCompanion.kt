package com.portfolio.apps.outsource.grofastdelivery

import com.portfolio.apps.outsource.grofastdelivery.data.GroFastItemsResponse
import com.portfolio.apps.outsource.grofastdelivery.retrofit.ApiRequest
import com.portfolio.apps.outsource.grofastdelivery.viewmodel.AllProductsResponse
import retrofit2.Call

class ApiRequestCompanion {

    companion object ApiRequestManager : ApiRequest {
        override fun getDealsOfTheDayList(): Call<AllProductsResponse?>? {
           return null
        }

        override fun getAllProductsList(): Call<GroFastItemsResponse>? {
          return null
        }


    }
}