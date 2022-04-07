package com.portfolio.apps.outsource.grofastdelivery.viewmodel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.portfolio.apps.outsource.grofast.fragment.GroFastItem

class AllProductsResponse {
    @SerializedName("response")
    @Expose
    private var response: AllProductsResponse? = null

    @SerializedName("data")
    @Expose
    private var allProductsList: List<GroFastItem?>? = null

    fun getAllProductsList(): List<GroFastItem?>? {
        return allProductsList
    }

    fun setAllProductsList(allProductsList: List<GroFastItem?>?) {
        this.allProductsList = allProductsList
    }

    fun getResponse(): AllProductsResponse? {
        return response
    }

    @SerializedName("status")
    @Expose
    private var status: String? = null

    fun setResponse(response: AllProductsResponse?) {
        this.response = response
    }

    fun getStatus(): String? {
        return status
    }

    fun setStatus(status: String?) {
        this.status = status
    }
}
