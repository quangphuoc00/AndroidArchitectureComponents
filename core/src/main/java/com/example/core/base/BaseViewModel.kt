package com.example.core.base

import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel() {
    fun handleError(throwable: Throwable) {
        //TODO
    }
}