package com.example.if3210_2022_android_33

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.if3210_2022_android_33.model.News
import com.example.if3210_2022_android_33.repository.Repository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repository): ViewModel() {
    val myResponse: MutableLiveData<News> = MutableLiveData()

    fun getNews() {
        viewModelScope.launch {
            val response: News = repository.getNews()
            myResponse.value = response
        }
    }
}