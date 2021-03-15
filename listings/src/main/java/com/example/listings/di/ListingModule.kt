package com.example.listings.di

import com.example.listings.data.ListingRepository
import com.example.listings.data.ListingRepositoryImpl
import com.example.listings.data.sources.ListingDataSource
import com.example.listings.data.sources.TestListingDataSource
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@Module
class ListingModule {
    @Provides
    fun provideDataSource() : ListingDataSource = TestListingDataSource()

    @Provides
    fun provideDispatcher() : CoroutineDispatcher = Dispatchers.IO

    @Provides
    fun provideRepository(dataSource: ListingDataSource, dispatcher: CoroutineDispatcher) : ListingRepository
            = ListingRepositoryImpl(dataSource, dispatcher)
}