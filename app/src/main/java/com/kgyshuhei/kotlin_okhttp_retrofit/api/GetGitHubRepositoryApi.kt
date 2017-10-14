package com.kgyshuhei.kotlin_okhttp_retrofit.api

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by shuhei_k on 2017/07/04.
 */
interface GetGitHubRepositoryApi {

    @GET("users/{user}/repos")
    fun getRepositoryList(@Path("user") user: String): Observable<List<GitHubRepositoryResponse>>

}
