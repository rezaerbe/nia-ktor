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
        listOf(1, 2),
        "https://medium.com/androiddevelopers/now-in-android-73-f0effa197dfb"
    ),
    Article(
        2,
        "Now in Android #72",
        "Android Dev Summit: Form Factors, Health Services, Google Play updates, Performance, and more!",
        "",
        "https://miro.medium.com/0*owVH_IF5OJcUVv0R",
        "2022-11-12",
        6,
        1,
        listOf(1, 3),
        "https://medium.com/androiddevelopers/now-in-android-72-1dba1cd404a"
    ),
    Article(
        3,
        "Now in Android #71",
        "Android Dev Summit, Modern Android development, Kotlin Multiplatform, Material Design, Now in Android app, and more!",
        "",
        "https://miro.medium.com/0*99F5VQ7eRCJivVpF",
        "2022-11-05",
        7,
        2,
        listOf(1, 4),
        "https://medium.com/androiddevelopers/now-in-android-71-248cd926bf7c"
    )
)