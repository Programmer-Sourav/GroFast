package com.portfolio.apps.outsource.grofastdelivery.retrofit

import com.portfolio.apps.outsource.grofastdelivery.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitRequest {
    private var retrofit: Retrofit? = null


    fun getRetrofitInstance(): Retrofit? {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(Constants.ALL_GROFAST_ITEMS_QUERY)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit
    }
}