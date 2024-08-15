package dev.fabdav.cheflinkapi.core.requests

/**
 *
 * @param name
 * @param description
 */
data class CreateCategoryRequest(
    val name: kotlin.String? = null,
    val description: kotlin.String? = null
)