package com.example.newsapp.api

import com.example.newsapp.retrofit.NewsResponse
import com.example.newsapp.util.Constant.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("v2/top-headlines?")
    suspend fun getAllBreakingNews(
        @Query("country")
        countryCode : String = "in",
        @Query("page")
        page:Int = 1,
        @Query("apiKey")
        apiKey:String = API_KEY
    ):Response<NewsResponse>

    @GET("v2/everything?")
    suspend fun getSearchForNews(
        @Query("q")
       searchQuery:String,
        @Query("page")
        page:Int = 1,
        @Query("apiKey")
        apiKey:String = API_KEY
    ):Response<NewsResponse>
}