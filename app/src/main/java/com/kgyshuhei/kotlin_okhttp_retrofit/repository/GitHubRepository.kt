package com.kgyshuhei.kotlin_okhttp_retrofit.repository

import com.kgyshuhei.kotlin_okhttp_retrofit.api.GitHubRepositoryResponse
import io.reactivex.Observable

/**
 * Created by shuhei_k on 2017/06/18.
 */
interface GitHubRepository {

    fun getRepositoryList(userName: String): Observable<List<GitHubRepositoryResponse>>

}
