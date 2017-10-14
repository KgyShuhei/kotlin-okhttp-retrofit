package com.kgyshuhei.kotlin_okhttp_retrofit.repository.impl

import com.kgyshuhei.kotlin_okhttp_retrofit.api.ApiClient
import com.kgyshuhei.kotlin_okhttp_retrofit.api.GetGitHubRepositoryApi
import com.kgyshuhei.kotlin_okhttp_retrofit.api.GitHubRepositoryResponse
import com.kgyshuhei.kotlin_okhttp_retrofit.repository.GitHubRepository
import io.reactivex.Observable

/**
 * Created by shuhei_k on 2017/09/10.
 */
class GitHubRepositoryImpl: GitHubRepository {

    override fun getRepositoryList(userName: String): Observable<List<GitHubRepositoryResponse>> {
        return ApiClient.instance.create(GetGitHubRepositoryApi::class.java).getRepositoryList(userName)
    }

}