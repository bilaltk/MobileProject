package com.bilaltk.mobileproject.data.api

import com.bilaltk.mobileproject.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): Response<MutableList<User>>
}