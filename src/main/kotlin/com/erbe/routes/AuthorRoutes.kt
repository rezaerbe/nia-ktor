package com.erbe.routes

import com.erbe.models.authorStorage
import com.erbe.util.customResponse
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.response.respondText
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route

fun Route.authorRouting() {
    route("/author") {
        get {
            if (authorStorage.isNotEmpty()) {
                call.respond(authorStorage)
            } else {
                call.respondText(
                    customResponse("No author found"),
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
            val author =
                authorStorage.find { it.id == id }
                    ?: return@get call.respondText(
                        customResponse("No author found with id $id"),
                        ContentType.Application.Json,
                        HttpStatusCode.NotFound
                    )
            call.respond(author)
        }
    }
}