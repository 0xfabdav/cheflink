package dev.fabdav.cheflinkapi.core.responses

import dev.fabdav.cheflinkapi.core.ItemStatus

/**
 *
 * @param id
 * @param name
 * @param price
 * @param discountPrice
 * @param status
 * @param description
 * @param allergens
 * @param categoryId
 */
data class MenuProductResponse(
    val id: kotlin.Int? = null,
    val name: kotlin.String? = null,
    val price: kotlin.Float? = null,
    val discountPrice: kotlin.Float? = null,
    val status: ItemStatus? = ItemStatus.Visible,
    val description: kotlin.String? = null,
    val allergens: kotlin.collections.List<kotlin.String>? = null,
    val categoryId: kotlin.Int? = null
)