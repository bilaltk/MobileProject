package com.bilaltk.mobileproject.data.repository

import com.bilaltk.mobileproject.data.api.RetrofitBuilder

class MainRepository {
    suspend fun getUsers() = RetrofitBuilder.api.getUsers()
}