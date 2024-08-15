package dev.fabdav.cheflinkapi.core.requests

import dev.fabdav.cheflinkapi.core.responses.ModifierGroupsResponseAvailableModifierGroupsInner

/**
 *
 * @param assignedModifierGroups
 */
data class UpdateModifierGroupAssignmentRequest(
    val assignedModifierGroups: kotlin.collections.List<ModifierGroupsResponseAvailableModifierGroupsInner>? = null
)