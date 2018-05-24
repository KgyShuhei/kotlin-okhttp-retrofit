package com.shuheikgy.android_mvvm_architecture.view.base

/**
 * Created by shuhei_k on 2017/09/24.
 */
abstract class BaseActivityViewModel {

    abstract fun onCreate()

    abstract fun onPostCreate()

    abstract fun onStart()

    abstract fun onResume()

    abstract fun onPostResume()

    abstract fun onPause()

    abstract fun onStop()

    abstract fun onDestroy()

}