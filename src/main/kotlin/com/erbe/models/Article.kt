package com.erbe.models

import kotlinx.serialization.Serializable

@Serializable
data class Article(
    val id: Int,
    val title: String,
    val description: String,
    val content: String,
    val imageUrl: String,
    val publishDate: String,
    val readTime: Int,
    val author: Int,
    val topics: List<Int>,
    val url: String
)

val articleStorage = mutableListOf(
    Article(
        1,
        "Now in Android #73",
        "Android Dev Summit: Platform track, Health Connect, Now in Android on Google Play, user choice billing, lazy layouts",
        "",
        "https://miro.medium.com/0*xEuK15gUA0YXznsR",
        "2022-11-17",
        5,
        1,
        listOf(1),
        "https://medium.com/androiddevelopers/now-in-android-73-f0effa197dfb"
    )
)