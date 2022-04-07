package com.portfolio.apps.outsource.grofastdelivery.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.portfolio.apps.outsource.grofast.fragment.GroFastItem
import com.portfolio.apps.outsource.grofastdelivery.data.OperationCallback
import com.portfolio.apps.outsource.grofastdelivery.repository.GroFastProductsRepository

class GroFastProductsViewModel (private val groFastProductsRepository: GroFastProductsRepository) : ViewModel() {

   private val _groFastItemsList = MutableLiveData<List<GroFastItem>>().apply { value = emptyList() }
   val groFastItemList: LiveData<List<GroFastItem>> = _groFastItemsList

   private val _isViewLoading = MutableLiveData<Boolean>()
   val isViewLoading = _isViewLoading

   private val _onMessageError = MutableLiveData<Any>();
   val onMessageError : LiveData<Any> = _onMessageError

   private val _isEmptyList = MutableLiveData<Boolean>();
   val isEmptyList : LiveData<Boolean> = _isEmptyList

    /*
   If you require that the data be loaded only once, you can consider calling the method
   "loadMuseums()" on constructor. Also, if you rotate the screen, the service will not be called.
   init {
       //loadMuseums()
   }
    */

    suspend fun loadGroceryProducts(){

        _isViewLoading.value = true
        groFastProductsRepository.fetchGroFastItems(object : OperationCallback<GroFastItem> {
            override fun onError(error: String?) {
                _isViewLoading.value = false
                _onMessageError.value = error!!
            }

            override fun onSuccess(data: List<GroFastItem>?) {
                _isViewLoading.value = false
                if (data.isNullOrEmpty()) {
                    _isEmptyList.value = true

                } else {
                    _groFastItemsList.value = data
                }
            }
        })
    }
}