package com.portfolio.apps.outsource.grofastdelivery.retrofit

import com.portfolio.apps.outsource.grofastdelivery.data.GroFastItemsResponse
import com.portfolio.apps.outsource.grofastdelivery.viewmodel.AllProductsResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiRequest {
        @GET("http://www.souravnath.com/index_mr.php/get_deals")
        fun getDealsOfTheDayList(): Call<AllProductsResponse?>?

        @GET("get_all_products")
        fun getAllProductsList(): Call<GroFastItemsResponse>?
}