package com.kgyshuhei.kotlin_okhttp_retrofit.view.main

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.kgyshuhei.kotlin_okhttp_retrofit.R
import com.kgyshuhei.kotlin_okhttp_retrofit.databinding.ActivityMainBinding
import com.kgyshuhei.kotlin_okhttp_retrofit.view.base.BaseActivity
import timber.log.Timber

class MainActivity : BaseActivity() {

    override val viewModel = MainActivityViewModel(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding? = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding?.viewModel = viewModel

        Timber.plant(Timber.DebugTree())

    }
}
