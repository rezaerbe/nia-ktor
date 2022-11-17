package com.erbe.models

import kotlinx.serialization.Serializable

@Serializable
data class Topic(
    val id: Int,
    val name: String,
    val follower: Int,
    val story: Int,
    val url: String
)

val topicStorage = mutableListOf(
    Topic(
        1,
        "Now In Android",
        0,
        0,
        "https://medium.com/tag/now-in-android"
    )
)