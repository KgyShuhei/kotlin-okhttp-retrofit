package com.shuheikgy.android_mvvm_architecture.api

import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import com.shuheikgy.android_mvvm_architecture.network.HttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by shuhei_k on 2017/07/04.
 */
object ApiClient {

    val instance = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .client(HttpClient.instance)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

}

private val gson = GsonBuilder()
        .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        .setPrettyPrinting()
        .create()