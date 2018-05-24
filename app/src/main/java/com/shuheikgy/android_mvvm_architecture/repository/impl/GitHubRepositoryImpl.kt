package com.shuheikgy.android_mvvm_architecture.repository.impl

import com.shuheikgy.android_mvvm_architecture.api.ApiClient
import com.shuheikgy.android_mvvm_architecture.api.GetGitHubRepositoryApi
import com.shuheikgy.android_mvvm_architecture.api.GitHubRepositoryResponse
import com.shuheikgy.android_mvvm_architecture.repository.GitHubRepository
import io.reactivex.Observable

/**
 * Created by shuhei_k on 2017/09/10.
 */
class GitHubRepositoryImpl: GitHubRepository {

    override fun getRepositoryList(userName: String): Observable<List<GitHubRepositoryResponse>> {
        return ApiClient.instance.create(GetGitHubRepositoryApi::class.java).getRepositoryList(userName)
    }

}