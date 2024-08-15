package dev.fabdav.cheflinkapi.core

import java.time.LocalDateTime

data class Category(
    var name: String,
    var sortNumber: Int,
    var description: String,
    var status: ItemStatus,
    var restaurant: Restaurant,
    var products: List<Product>,
    var createdAt: LocalDateTime,
    var updatedAt: LocalDateTime
)
