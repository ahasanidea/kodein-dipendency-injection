package com.ahasanidea.kodeindependencyinjection.data.model

data class Note(
    val title: String,
    val detail: String
) {
    override fun toString() = "$title - $detail"
}