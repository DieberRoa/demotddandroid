package com.pragma.demo3tdd.features.stuff.entities

import kotlinx.serialization.*

@Serializable
data class ResponseStuff (
    val data: List<Datum>? = null,
    val operation: Operation? = null
)

@Serializable
data class Datum (
    val id: Long? = null,
    val name: String? = null,
    val state: Long? = null
)

@Serializable
data class Operation (
    val code: String? = null,
    val description: String? = null
)