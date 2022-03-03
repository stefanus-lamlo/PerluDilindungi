package com.example.if3210_2022_android_33.repository

import com.example.if3210_2022_android_33.api.RetrofitInstance
import com.example.if3210_2022_android_33.model.News

class Repository {
    suspend fun getNews(): News {
        return RetrofitInstance.API.getNews()
    }
}