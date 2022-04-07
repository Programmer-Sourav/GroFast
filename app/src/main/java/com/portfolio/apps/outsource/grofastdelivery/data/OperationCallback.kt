package com.portfolio.apps.outsource.grofastdelivery.data

    interface OperationCallback<T> {
        fun onSuccess(data: List<T>?)
        fun onError(error: String?)

}