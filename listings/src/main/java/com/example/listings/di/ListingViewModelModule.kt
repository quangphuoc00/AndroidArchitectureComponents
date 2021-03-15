package com.example.listings.di

import androidx.lifecycle.ViewModel
import com.example.core.di.ViewModelKey
import com.example.listings.ui.ListingViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ListingViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(ListingViewModel::class)
    abstract fun bindMyViewModel(myViewModel: ListingViewModel): ViewModel
}