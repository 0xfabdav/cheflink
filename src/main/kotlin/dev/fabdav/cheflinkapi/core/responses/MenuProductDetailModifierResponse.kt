package dev.fabdav.cheflinkapi.core.responses

import dev.fabdav.cheflinkapi.core.ItemStatus

/**
 *
 * @param id
 * @param name
 * @param price
 * @param discountPrice
 * @param status
 * @param allergens
 * @param modifierGroupId
 * @param modifierGroupName
 */
data class MenuProductDetailModifierResponse(
    val id: kotlin.Int? = null,
    val name: kotlin.String? = null,
    val price: kotlin.Float? = null,
    val discountPrice: kotlin.Float? = null,
    val status: ItemStatus? = ItemStatus.Visible,
    val allergens: kotlin.collections.List<kotlin.String>? = null,
    val modifierGroupId: kotlin.Int? = null,
    val modifierGroupName: kotlin.String? = null
)