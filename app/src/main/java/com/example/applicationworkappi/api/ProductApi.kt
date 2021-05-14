package com.example.applicationworkappi.api

import com.example.applicationworkappi.model.Product
import retrofit2.Call
import retrofit2.http.GET

interface ProductApi {
    @GET("getdata.php")

    fun getProductApi(): Call<List<Product>>
}