package dev.fabdav.cheflinkapi.core

import java.time.LocalDateTime

data class Product(
    val id: Long,
    var name: String,
    var price: Float,
    var discountPrice: Float,
    var sortNumber: Int,
    var description: String,
    var status: ItemStatus,
    var category: Category,
    var restaurant: Restaurant,
    var createdAt: LocalDateTime,
    var updatedAt: LocalDateTime
)
