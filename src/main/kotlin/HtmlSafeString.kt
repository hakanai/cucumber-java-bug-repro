package com.example.bug

@JvmInline
value class HtmlSafeString(private val content: String) {
    fun toHtml() {
        content
    }
}