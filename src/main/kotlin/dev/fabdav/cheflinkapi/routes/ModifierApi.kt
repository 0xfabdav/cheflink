/**
 * Cheflink - Self Ordering System 3.0
 * Test Description
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package dev.fabdav.cheflinkapi.apis

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.ModifierApi() {
    route("/modifier-groups/{modifierGroupId}/modifiers") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """[ {
              "price" : 2.302136,
              "sortNumber" : 9,
              "name" : "name",
              "discountPrice" : 7.0614014,
              "id" : 5,
              "status" : "visible",
              "modifierGroupId" : 3
            }, {
              "price" : 2.302136,
              "sortNumber" : 9,
              "name" : "name",
              "discountPrice" : 7.0614014,
              "id" : 5,
              "status" : "visible",
              "modifierGroupId" : 3
            } ]"""

            when (exampleContentType) {
                "application/json" -> call.respond(exampleContentString)
                else -> call.respondText(exampleContentString)
            }

        }
    }

    route("/modifier-groups/{modifierGroupId}/modifiers/{modifierId}") {
        delete {
            call.respond(HttpStatusCode.NotImplemented)

        }
    }

    route("/modifier-groups/{modifierGroupId}/modifiers/{modifierId}/allergens") {
        get {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "name" : "name",
              "isSelected" : true,
              "id" : 0
            }"""

            when (exampleContentType) {
                "application/json" -> call.respond(exampleContentString)
                else -> call.respondText(exampleContentString)
            }

        }
    }

    route("/modifier-groups/{modifierGroupId}/modifiers") {
        get {
            val exampleContentType = "application/json"
            val exampleContentString = """[ {
              "price" : 2.302136,
              "sortNumber" : 9,
              "name" : "name",
              "discountPrice" : 7.0614014,
              "id" : 5,
              "status" : "visible",
              "modifierGroupId" : 3
            }, {
              "price" : 2.302136,
              "sortNumber" : 9,
              "name" : "name",
              "discountPrice" : 7.0614014,
              "id" : 5,
              "status" : "visible",
              "modifierGroupId" : 3
            } ]"""

            when (exampleContentType) {
                "application/json" -> call.respond(exampleContentString)
                else -> call.respondText(exampleContentString)
            }

        }
    }

    route("/modifier-groups/{modifierGroupId}/modifiers/{modifierId}") {
        patch {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "price" : 2.302136,
              "sortNumber" : 9,
              "name" : "name",
              "discountPrice" : 7.0614014,
              "id" : 5,
              "status" : "visible",
              "modifierGroupId" : 3
            }"""

            when (exampleContentType) {
                "application/json" -> call.respond(exampleContentString)
                else -> call.respondText(exampleContentString)
            }

        }
    }

    route("/modifier-groups/{modifierGroupId}/modifiers/{modifierId}/allergens") {
        patch {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "name" : "name",
              "isSelected" : true,
              "id" : 0
            }"""

            when (exampleContentType) {
                "application/json" -> call.respond(exampleContentString)
                else -> call.respondText(exampleContentString)
            }

        }
    }

}
