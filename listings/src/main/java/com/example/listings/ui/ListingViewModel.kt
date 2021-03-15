package com.example.listings.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.base.BaseViewModel
import com.example.listings.data.ListingRepository
import com.example.listings.models.ProductSummary
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

class ListingViewModel @Inject constructor(
    private val repository: ListingRepository
): BaseViewModel() {
    private var _products = MutableLiveData<List<ProductSummary>>()
    val products: LiveData<List<ProductSummary>>
        get() = _products

    init {
        getProducts()
    }

    private fun getProducts() = viewModelScope.launch {
        repository.getListings(1)
            .catch { handleError(it) }
            .collect { _products.value = it }
    }
}