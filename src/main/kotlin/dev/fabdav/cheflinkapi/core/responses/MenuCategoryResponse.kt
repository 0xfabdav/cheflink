package dev.fabdav.cheflinkapi.core.responses

import dev.fabdav.cheflinkapi.core.ItemStatus

/**
 *
 * @param id
 * @param name
 * @param sortNumber
 * @param status
 * @param products
 */
data class MenuCategoryResponse(
    val id: kotlin.Int? = null,
    val name: kotlin.String? = null,
    val sortNumber: kotlin.Int? = null,
    val status: ItemStatus? = ItemStatus.Visible,
    val products: kotlin.collections.List<MenuProductResponse>? = null
)