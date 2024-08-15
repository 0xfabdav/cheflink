package dev.fabdav.cheflinkapi.core.responses

import dev.fabdav.cheflinkapi.core.ItemStatus

/**
 *
 * @param id
 * @param name
 * @param price
 * @param discountPrice
 * @param sortNumber
 * @param status
 * @param modifierGroupId
 */
data class ModifierResponse(
    val id: kotlin.Int? = null,
    val name: kotlin.String? = null,
    val price: kotlin.Float? = null,
    val discountPrice: kotlin.Float? = null,
    val sortNumber: kotlin.Int? = null,
    val status: ItemStatus? = ItemStatus.Visible,
    val modifierGroupId: kotlin.Int? = null
)