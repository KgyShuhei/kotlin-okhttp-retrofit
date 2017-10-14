package com.kgyshuhei.kotlin_okhttp_retrofit.view.main

import android.view.View
import com.kgyshuhei.kotlin_okhttp_retrofit.repository.impl.GitHubRepositoryImpl
import com.kgyshuhei.kotlin_okhttp_retrofit.view.base.BaseActivityViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import timber.log.Timber

/**
 * Created by shuhei_k on 2017/09/10.
 */
class MainActivityViewModel(val activity: MainActivity) : BaseActivityViewModel() {

    private val repository = GitHubRepositoryImpl()

    fun onClickButton(view: View) {

        repository.getRepositoryList("KgyShuhei")
                .compose(activity.bindToLifecycle())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { response ->
                            var tmp = ""
                            response.forEach { repos ->
                                tmp += repos.fullName + "\n"
                            }
                            if (activity is MainActivity) {
                                activity.repos_textview ?.text = tmp
                            }
                        },
                        { error ->
                            Timber.d(error)
                        }
                )

    }

    override fun onCreate() {
    }

    override fun onPostCreate() {
    }

    override fun onStart() {
    }

    override fun onResume() {
    }

    override fun onPostResume() {
    }

    override fun onPause() {
    }

    override fun onStop() {
    }

    override fun onDestroy() {
    }
}