package com.example.listings.data

import com.example.listings.data.sources.ListingDataSource
import com.example.listings.models.ProductSummary
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ListingRepositoryImpl @Inject constructor(
    private val dataSource: ListingDataSource,
    private val ioDispatcher: CoroutineDispatcher
) : ListingRepository
{
    override suspend fun getListings(page: Int) = withContext(ioDispatcher) {
        return@withContext dataSource.getListings(page)
    }
}