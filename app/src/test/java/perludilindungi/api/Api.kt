package com.example.if3210_2022_android_33.api

import com.example.if3210_2022_android_33.model.News
import retrofit2.http.GET

interface Api {
    @GET("get-news")
    suspend fun getNews(): News
}