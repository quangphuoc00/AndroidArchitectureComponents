package com.example.listings.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.core.base.BaseFragment
import com.example.listings.databinding.ActivityListingsBinding
import javax.inject.Inject

class ListingsFragment : BaseFragment() {
    private lateinit var binding: ActivityListingsBinding
    private val adapter = ListingsAdapter()

    private lateinit var viewModel: ListingViewModel
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    companion object {
        fun newInstance() = ListingsFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this, this.viewModelFactory).get(ListingViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ActivityListingsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpRecyclerView()
        observeProducts()
    }

    private fun observeProducts() {
        viewModel.products.observe(viewLifecycleOwner, Observer {
            adapter.addItems(it)
        })
    }

    private fun setUpRecyclerView() {
        binding.productsList.adapter = adapter
    }
}