package dev.fabdav.cheflinkapi.core.requests

/**
 *
 * @param name
 * @param price
 * @param discountPrice
 * @param sortNumber
 */
data class ModifierRequest(
    val name: kotlin.String? = null,
    val price: kotlin.Float? = null,
    val discountPrice: kotlin.Float? = null,
    val sortNumber: kotlin.Int? = null
)