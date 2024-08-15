package dev.fabdav.cheflinkapi.core.responses

import dev.fabdav.cheflinkapi.core.ItemStatus

/**
 *
 * @param id
 * @param type
 * @param name
 * @param price
 * @param discountPrice
 * @param status
 * @param description
 * @param categoryId
 */
data class ProductResponse(
    val id: kotlin.Int? = null,
    val type: kotlin.String? = null,
    val name: kotlin.String? = null,
    val price: kotlin.Float? = null,
    val discountPrice: kotlin.Float? = null,
    val status: ItemStatus? = ItemStatus.Visible,
    val description: kotlin.String? = null,
    val categoryId: kotlin.Int? = null
)