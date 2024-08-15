package dev.fabdav.cheflinkapi.core.requests

import dev.fabdav.cheflinkapi.core.ItemStatus

/**
 *
 * @param name
 * @param price
 * @param sortNumber
 * @param discountPrice
 * @param description
 * @param status
 */
data class UpdateProductRequest(
    val name: kotlin.String? = null,
    val price: kotlin.Float? = null,
    val sortNumber: kotlin.Int? = null,
    val discountPrice: kotlin.Float? = null,
    val description: kotlin.String? = null,
    val status: ItemStatus? = ItemStatus.Visible
)