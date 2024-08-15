package dev.fabdav.cheflinkapi.core.services

import dev.fabdav.cheflinkapi.core.Category

interface CategoryService {
    suspend fun getCategory(categoryId: Int): Category?

    suspend fun createCategory(category: Category): Category?

    suspend fun updateCategory(category: Category): Category

    suspend fun deleteCategory(categoryId: Int): Category
}