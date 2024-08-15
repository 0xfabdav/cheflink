package dev.fabdav.cheflinkapi.core.responses

import dev.fabdav.cheflinkapi.core.ItemStatus

/**
 *
 * @param id
 * @param name
 * @param type
 * @param status
 * @param description
 */
data class CategoryResponse(
    val id: kotlin.Int? = null,
    val name: kotlin.String? = null,
    val type: kotlin.String? = null,
    val status: ItemStatus? = ItemStatus.Visible,
    val description: kotlin.String? = null
)