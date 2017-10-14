package com.kgyshuhei.kotlin_okhttp_retrofit.network

import com.kgyshuhei.kotlin_okhttp_retrofit.BuildConfig
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

/**
 * Created by shuhei_k on 2017/06/18.
 */
object HttpClient {

    val instance: OkHttpClient? = OkHttpClient()
            .newBuilder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(15, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .addInterceptor { chain: Interceptor.Chain? ->
                val request = chain!!.request().newBuilder()
                        .addHeader("Accept", "application/json")
                        .build()
                chain.proceed(request)
            }.addInterceptor(initHttpLoggingInterceptor()).build()

}

private fun initHttpLoggingInterceptor(): HttpLoggingInterceptor {

    return HttpLoggingInterceptor().apply {
        level = if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor.Level.BODY
        } else {
            HttpLoggingInterceptor.Level.NONE
        }
    }

}