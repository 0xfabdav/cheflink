package dev.fabdav.cheflinkapi.core.requests

/**
 *
 * @param id
 * @param name
 * @param isSelected
 */
data class UpdateModifierAllergensRequest(
    val id: kotlin.Int? = null,
    val name: kotlin.String? = null,
    val isSelected: kotlin.Boolean? = null
)