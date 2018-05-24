package com.shuheikgy.android_mvvm_architecture.view.main

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.shuheikgy.android_mvvm_architecture.R
import com.shuheikgy.android_mvvm_architecture.databinding.ActivityMainBinding
import com.shuheikgy.android_mvvm_architecture.view.base.BaseActivity
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
