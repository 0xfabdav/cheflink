package dev.fabdav.cheflinkapi.core.responses

/**
 *
 * @param id
 * @param name
 * @param products
 */
data class CategoriesProductsResponseInner(
    val id: kotlin.Int? = null,
    val name: kotlin.String? = null,
    val products: kotlin.collections.List<CategoriesProductsResponseInnerProductsInner>? = null
)