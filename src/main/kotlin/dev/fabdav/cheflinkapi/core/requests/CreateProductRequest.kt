package dev.fabdav.cheflinkapi.core.requests

/**
 *
 * @param name
 * @param price
 * @param sortNumber
 * @param discountPrice
 * @param description
 */
data class CreateProductRequest(
    val name: kotlin.String? = null,
    val price: kotlin.Float? = null,
    val sortNumber: kotlin.Int? = null,
    val discountPrice: kotlin.Float? = null,
    val description: kotlin.String? = null
)