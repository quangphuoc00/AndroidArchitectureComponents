package com.example.androidarchitecturecomponents

import android.os.Bundle
import android.text.TextUtils.replace
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import com.example.listings.ui.ListingsFragment
import dagger.android.AndroidInjection

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        with(supportFragmentManager.beginTransaction()) {
            replace(R.id.fragment_container, ListingsFragment.newInstance())
            commit()
        }
    }
}