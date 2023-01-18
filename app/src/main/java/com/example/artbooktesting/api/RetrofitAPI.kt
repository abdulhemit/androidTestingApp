package com.example.artbooktesting.api

import com.example.artbooktesting.model.ImageResponse
import com.example.artbooktesting.util.util.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitAPI  {

    @GET("/api/")
    suspend fun searchImage(
        @Query("q") searchQuary: String,
        @Query("key") apiKey : String = API_KEY
    ) : Response<ImageResponse>

}