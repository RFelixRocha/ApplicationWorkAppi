package com.example.applicationworkappi.model

import com.google.gson.annotations.SerializedName

class Product(
    @SerializedName("id")
    val id: String,
    @SerializedName("prname")
    val prName: String,
    @SerializedName("primage")
    val prImage: String,
    @SerializedName("prprice")
    val prPriceL: String
) {

}