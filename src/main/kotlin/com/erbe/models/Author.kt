package com.erbe.models

import kotlinx.serialization.Serializable

@Serializable
data class Author(
    val id: Int,
    val name: String,
    val bio: String,
    val imageUrl: String,
    val follower: Int,
    val url: String
)

val authorStorage = mutableListOf(
    Author(
        1,
        "Daniel Galpin",
        "Developer Advocate at Google, writer, editor, theatrical performer, and social dancer.",
        "https://miro.medium.com/1*9j85cICWzDQeY8Nb4QrL4Q.jpeg",
        0,
        "https://medium.com/@dagalpin"
    )
)