package dev.fabdav.cheflinkapi.impl.exposed.mapping;

import dev.fabdav.cheflinkapi.core.Category
import dev.fabdav.cheflinkapi.core.ItemStatus
import dev.fabdav.cheflinkapi.core.Product
import dev.fabdav.cheflinkapi.core.Restaurant
import org.jetbrains.exposed.dao.IntEntity;
import org.jetbrains.exposed.dao.IntEntityClass;
import org.jetbrains.exposed.dao.id.EntityID;
import org.jetbrains.exposed.dao.id.IntIdTable;
import org.jetbrains.exposed.sql.javatime.datetime


object CategoriesTable : IntIdTable("categories") {
    val name = varchar("name", 50)
    val sortNumber = integer("sort_number")
    val description = varchar("description", 250)
    val status = varchar("status", 50)

    //val restaurant= reference(("restaurantId")) // hier bitte rausfinden
    // wie man relations deklariert @stinktio
    val createdAt = datetime("created_at")
    val updatedAt = datetime("updated_at")
}

class CategoryDAO(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<CategoryDAO>(CategoriesTable)

    var name by CategoriesTable.name
    var sortNumber by CategoriesTable.sortNumber
    var description by CategoriesTable.description
    var status by CategoriesTable.status
    //var restaurantId by CategoriesTable.restaurantId
    var createdAt by CategoriesTable.createdAt
    var updatedAt by CategoriesTable.updatedAt
}

fun CategoryDAO.ToCategory(dao: CategoryDAO) = Category(
    dao.name,
    dao.sortNumber,
    dao.description,
    ItemStatus.valueOf(dao.status),
    Restaurant(),//???
    emptyList<Product>(),//???
    dao.createdAt,
    dao.updatedAt


)