package com.kgyshuhei.kotlin_okhttp_retrofit.view.base

import android.os.Bundle
import android.os.PersistableBundle
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity

/**
 * Created by shuhei_k on 2017/09/24.
 */
abstract class BaseActivity : RxAppCompatActivity() {

    abstract val viewModel: BaseActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.onCreate()
    }

    override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onPostCreate(savedInstanceState, persistentState)

        viewModel.onPostCreate()
    }

    override fun onStart() {
        super.onStart()

        viewModel.onStart()
    }

    override fun onResume() {
        super.onResume()

        viewModel.onResume()
    }

    override fun onPostResume() {
        super.onPostResume()

        viewModel.onPostResume()
    }

    override fun onPause() {
        super.onPause()

        viewModel.onPause()
    }

    override fun onStop() {
        super.onStop()

        viewModel.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()

        viewModel.onDestroy()
    }
}