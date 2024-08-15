package dev.fabdav.cheflinkapi.core.requests

import dev.fabdav.cheflinkapi.core.ItemStatus

/**
 *
 * @param name
 * @param status
 * @param description
 */
data class UpdateCategoryRequest(
    val name: kotlin.String? = null,
    val status: ItemStatus? = ItemStatus.Visible,
    val description: kotlin.String? = null
)