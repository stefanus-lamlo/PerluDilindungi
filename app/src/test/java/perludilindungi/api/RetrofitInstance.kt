package com.example.if3210_2022_android_33.api

import com.example.if3210_2022_android_33.utils.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val API: Api by lazy {
        retrofit.create(Api::class.java)
    }

}