package com.example.if3210_2022_android_33.model

import java.util.*

data class News(
    val success: Boolean,
    val message: String,
    val count_total: Integer,
    val results: Objects
)