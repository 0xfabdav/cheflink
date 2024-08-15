package dev.fabdav.cheflinkapi.core.requests

/**
 *
 * @param name
 * @param min
 * @param max
 * @param sortNumber
 * @param description
 * @param modifiers
 */
data class UpdateModifierGroupRequest(
    val name: kotlin.String? = null,
    val min: kotlin.Int? = null,
    val max: kotlin.Int? = null,
    val sortNumber: kotlin.Int? = null,
    val description: kotlin.String? = null,
    val modifiers: kotlin.collections.List<CreateModifierRequest>? = null
)