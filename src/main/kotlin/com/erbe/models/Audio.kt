package com.erbe.models

import kotlinx.serialization.Serializable

@Serializable
data class Audio(
    val id: Int,
    val title: String,
    val description: String,
    val imageUrl: String,
    val publishDate: String,
    val listenTime: Int,
    val url: String
)

val audioStorage = mutableListOf(
    Audio(
        1,
        "73 - Android Dev Summit: Platform, Now in Android on Google Play, and more!",
        "Welcome to Now in Android, your ongoing guide to what’s new and notable in the world of Android development. Today, we’re covering updates on the Platform track at #AndroidDevSummit ‘22, Health Connect, Now in Android on Google Play, user choice billing, and more!",
        "https://ssl-static.libsyn.com/p/assets/6/6/1/5/66152421c85ec579bafc7308ab683e82/NIA073_Podcast_Thumb.jpg",
        "2022-11-17",
        5,
        "https://podcasts.google.com/feed/aHR0cHM6Ly9ub3dpbmFuZHJvaWQubGlic3luLmNvbS9yc3M/episode/MTYyZmQxMGYtYTczZC00ZmEzLTkwMWUtNDdjNmU3ZjVjZTUz"
    )
)