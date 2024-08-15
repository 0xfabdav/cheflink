package dev.fabdav.cheflinkapi.core.responses

/**
 *
 * @param menu
 */
data class MenuResponse(
    val menu: kotlin.collections.List<MenuCategoryResponse>? = null
)