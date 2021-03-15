package com.example.listings.data.sources

import com.example.listings.models.ProductSummary
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class TestListingDataSource : ListingDataSource {
    override suspend fun getListings(page: Int): Flow<List<ProductSummary>>  = flow {
        when (page) {
            1 -> emit(listOf(
                ProductSummary(1, "product 1"),
                ProductSummary(2, "product 2"),
                ProductSummary(3, "product 3"),
                ProductSummary(4, "product 4"),
                ProductSummary(5, "product 5"),
                ProductSummary(6, "product 6"),
                ProductSummary(7, "product 7"),
                ProductSummary(8, "product 8"),
                ProductSummary(9, "product 9"),
                ProductSummary(10, "product 10"),
                ProductSummary(11, "product 11"),
                ProductSummary(12, "product 12"),
                ProductSummary(13, "product 13"),
                ProductSummary(14, "product 14"),
                ProductSummary(15, "product 15")
            ))
            2 -> emit(listOf(
                ProductSummary(16, "product 16"),
                ProductSummary(17, "product 17"),
                ProductSummary(18, "product 18"),
                ProductSummary(19, "product 19"),
                ProductSummary(20, "product 20"),
                ProductSummary(21, "product 21"),
                ProductSummary(22, "product 22"),
                ProductSummary(22, "product 23"),
                ProductSummary(24, "product 24"),
                ProductSummary(25, "product 25"),
                ProductSummary(26, "product 26"),
                ProductSummary(27, "product 27"),
                ProductSummary(28, "product 28"),
                ProductSummary(29, "product 29"),
                ProductSummary(30, "product 30")
            ))
        }
    }
}