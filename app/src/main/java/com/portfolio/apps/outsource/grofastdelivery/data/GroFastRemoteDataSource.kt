package com.portfolio.apps.outsource.grofastdelivery.data

import com.portfolio.apps.outsource.grofast.fragment.GroFastItem
import com.portfolio.apps.outsource.grofastdelivery.model.GroFastDataSource
import com.portfolio.apps.outsource.grofastdelivery.retrofit.ApiRequest
import com.portfolio.apps.outsource.grofastdelivery.retrofit.RetrofitRequest
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GroFastRemoteDataSource(private var apiRequest: ApiRequest?) : GroFastDataSource{
    private var call: Call<GroFastItemsResponse>? = null


    override suspend fun retrieveGroFastItems(callback: OperationCallback<GroFastItem>) {

        apiRequest = RetrofitRequest().getRetrofitInstance()?.create(ApiRequest::class.java)
        call = apiRequest?.getAllProductsList()
        call?.enqueue(object : Callback<GroFastItemsResponse> {
            override fun onFailure(call: Call<GroFastItemsResponse>, t: Throwable) {
                callback.onError(t.message)
            }

            override fun onResponse(
                call: Call<GroFastItemsResponse>,
                response: Response<GroFastItemsResponse>
            ) {
                response.body()?.let {
                    if (response.isSuccessful) {
                        callback.onSuccess(it.getAllProductsList() as List<GroFastItem>?)
                    } else {
                        callback.onError(it.getStatus())
                    }
                }
            }
        })
    }

    override fun cancel() {
        call?.let {
            it.cancel()
        }
    }
}