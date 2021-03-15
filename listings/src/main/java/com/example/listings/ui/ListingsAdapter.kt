package com.example.listings.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.core.base.BaseRecyclerAdapter
import com.example.listings.R
import com.example.listings.models.ProductSummary

class ListingsAdapter : BaseRecyclerAdapter<ProductSummary>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ProductSummaryViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_product_summary, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ProductSummaryViewHolder -> holder.onBind(items[position])
        }
    }

    class ProductSummaryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(productSummary: ProductSummary) {
            itemView.findViewById<TextView>(R.id.tvName).text = productSummary.name
        }
    }
}