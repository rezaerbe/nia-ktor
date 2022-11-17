package com.erbe.routes

import com.erbe.models.topicStorage
import com.erbe.util.customResponse
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.response.respondText
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route

fun Route.topicRouting() {
    route("/topic") {
        get {
            if (topicStorage.isNotEmpty()) {
                call.respond(topicStorage)
            } else {
                call.respondText(
                    customResponse("No topic found"),
                    ContentType.Application.Json,
                    HttpStatusCode.NotFound
                )
            }
        }

        get("{id?}") {
            val id = call.parameters["id"]?.toInt()
                ?: return@get call.respondText(
                    customResponse("Missing id"),
                    ContentType.Application.Json,
                    HttpStatusCode.BadRequest
                )
            val topic =
                topicStorage.find { it.id == id }
                    ?: return@get call.respondText(
                        customResponse("No topic found with id $id"),
                        ContentType.Application.Json,
                        HttpStatusCode.NotFound
                    )
            call.respond(topic)
        }
    }
}