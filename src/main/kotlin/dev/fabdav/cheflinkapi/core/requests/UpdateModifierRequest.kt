package dev.fabdav.cheflinkapi.core.requests

import dev.fabdav.cheflinkapi.core.ItemStatus

/**
 *
 * @param name
 * @param price
 * @param discountPrice
 * @param sortNumber
 * @param status
 */
data class UpdateModifierRequest(
    val name: kotlin.String? = null,
    val price: kotlin.Float? = null,
    val discountPrice: kotlin.Float? = null,
    val sortNumber: kotlin.Int? = null,
    val status: ItemStatus? = ItemStatus.Visible
)