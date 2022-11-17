package com.erbe.util

fun customResponse(message: String): String {
    return """{"message":"$message"}"""
}