package com.shuheikgy.android_mvvm_architecture.api

import com.google.gson.annotations.SerializedName

/**
 * Created by shuhei_k on 2017/06/18.
 */
data class GitHubRepositoryResponse(
        @SerializedName("full_name")
        val fullName: String
)
