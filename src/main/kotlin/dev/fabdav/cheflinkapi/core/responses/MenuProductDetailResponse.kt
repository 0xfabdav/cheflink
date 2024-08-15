package dev.fabdav.cheflinkapi.core.responses

/**
 *
 * @param id
 * @param name
 * @param price
 * @param discountPrice
 * @param description
 * @param allergens
 * @param extras
 * @param variations
 */
data class MenuProductDetailResponse(
    val id: kotlin.Int? = null,
    val name: kotlin.String? = null,
    val price: kotlin.Float? = null,
    val discountPrice: kotlin.Float? = null,
    val description: kotlin.String? = null,
    val allergens: kotlin.collections.List<kotlin.String>? = null,
    val extras: kotlin.collections.List<MenuProductDetailModifierGroupResponse>? = null,
    val variations: kotlin.collections.List<MenuProductDetailModifierGroupResponse>? = null
)