package dev.fabdav.cheflinkapi.core.responses

/**
 *
 * @param availableModifierGroups
 * @param assignedModifierGroups
 */
data class ModifierGroupsResponse(
    val availableModifierGroups: kotlin.collections.List<ModifierGroupsResponseAvailableModifierGroupsInner>? = null,
    val assignedModifierGroups: kotlin.collections.List<ModifierGroupsResponseAvailableModifierGroupsInner>? = null
)