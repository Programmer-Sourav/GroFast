package com.portfolio.apps.outsource.grofastdelivery.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.portfolio.apps.outsource.grofast.fragment.GroFastItem

class GroFastItemsResponse {
    @SerializedName("response")
    @Expose
    private var response: GroFastItemsResponse? = null

    @SerializedName("data")
    @Expose
    private var allProductsList: List<GroFastItem?>? = null

    fun getAllProductsList(): List<GroFastItem?>? {
        return allProductsList
    }

    fun setAllProductsList(allProductsList: List<GroFastItem?>?) {
        this.allProductsList = allProductsList
    }

    fun getResponse(): GroFastItemsResponse? {
        return response
    }

    @SerializedName("status")
    @Expose
    private var status: String? = null

    fun setResponse(response: GroFastItemsResponse?) {
        this.response = response
    }

    fun getStatus(): String? {
        return status
    }

    fun setStatus(status: String?) {
        this.status = status
    }
}
