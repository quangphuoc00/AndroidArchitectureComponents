package com.example.listings.data.sources

import com.example.listings.models.ProductSummary
import kotlinx.coroutines.flow.Flow

interface ListingDataSource {
    suspend fun getListings(page: Int): Flow<List<ProductSummary>>
}