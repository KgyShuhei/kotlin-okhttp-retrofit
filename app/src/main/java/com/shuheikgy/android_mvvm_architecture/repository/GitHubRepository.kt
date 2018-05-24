package com.shuheikgy.android_mvvm_architecture.repository

import com.shuheikgy.android_mvvm_architecture.api.GitHubRepositoryResponse
import io.reactivex.Observable

/**
 * Created by shuhei_k on 2017/06/18.
 */
interface GitHubRepository {

    fun getRepositoryList(userName: String): Observable<List<GitHubRepositoryResponse>>

}
