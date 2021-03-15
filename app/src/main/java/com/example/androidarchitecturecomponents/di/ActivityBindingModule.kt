package com.example.androidarchitecturecomponents.di

import com.example.core.di.FragmentScope
import com.example.listings.di.ListingModule
import com.example.listings.di.ListingViewModelModule
import com.example.listings.ui.ListingsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Module
abstract class ActivityBindingModule {
    @FragmentScope
    @ContributesAndroidInjector(modules = [
        AndroidSupportInjectionModule::class,
        ListingModule::class,
        ListingViewModelModule::class])
    internal abstract fun contributeListingsActivity(): ListingsFragment
}