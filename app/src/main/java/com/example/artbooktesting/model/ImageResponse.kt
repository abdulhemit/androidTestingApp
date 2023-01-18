package com.example.artbooktesting.model

data class ImageResponse(
    val total: Int,
    val totalHist: Int,
    val hist: List<ImageResult>
)
