package com.example.listings.data

import com.example.listings.models.ProductSummary
import kotlinx.coroutines.flow.Flow

interface ListingRepository {
    suspend fun getListings(page: Int): Flow<List<ProductSummary>>
}