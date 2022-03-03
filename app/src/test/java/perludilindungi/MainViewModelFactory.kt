package com.example.if3210_2022_android_33

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.if3210_2022_android_33.repository.Repository

class MainViewModelFactory(private val repository: Repository): ViewModelProvider.Factory {
    override fun <T: ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}