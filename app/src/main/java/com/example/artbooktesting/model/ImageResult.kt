package com.example.artbooktesting.model

import com.google.gson.annotations.SerializedName
import java.sql.RowId

data class ImageResult(

    val id: Int,
    val pageURL: String,
    val type: String,
    val tags: String,
    val previewURL: String,
    val previewWidth: Int,
    val previewHeight: Int,
    val webformatURL: String,
    val webformatWidth: Int,
    val webformatHeight: Int,
    val largeImageURL: String,
    val imageWidth: Int,
    val imageHeight: Int,
    val imageSize: Int,
    val views: Int,
    val downloads: Int,
    val collections: Int,
    val likes: Int,
    val comments: Int,
    @SerializedName("user_id")
    val userId: Int,
    val user: String,
    val userImageURL: String

)
