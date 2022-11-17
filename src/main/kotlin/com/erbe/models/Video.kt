package com.erbe.models

import kotlinx.serialization.Serializable

@Serializable
data class Video(
    val id: Int,
    val title: String,
    val description: String,
    val imageUrl: String,
    val like: Int,
    val view: Int,
    val publishDate: String,
    val url: String
)

val videoStorage = mutableListOf(
    Video(
        1,
        "Now in Android: 73 - Android Dev Summit: Platform, Now in Android on Google Play, and more!",
        "Welcome to Now in Android, your ongoing guide to what’s new and notable in the world of Android development. Today, we’re covering updates on the Platform track at #AndroidDevSummit ‘22, Health Connect, Now in Android on Google Play, user choice billing, and more!",
        "https://i3.ytimg.com/vi/kMmkG5MUREY/maxresdefault.jpg",
        0,
        0,
        "2022-11-17",
        "https://youtu.be/kMmkG5MUREY"
    )
)