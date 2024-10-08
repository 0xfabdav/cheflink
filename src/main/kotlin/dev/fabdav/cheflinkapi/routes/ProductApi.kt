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

fun Route.ProductApi() {

    route("/categories/{categoryId}/products") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "price" : 6.0274563,
              "name" : "name",
              "discountPrice" : 1.4658129,
              "description" : "description",
              "id" : 0,
              "type" : "type",
              "categoryId" : 5,
              "status" : "visible"
            }"""

            when (exampleContentType) {
                "application/json" -> call.respond(exampleContentString)
                else -> call.respondText(exampleContentString)
            }

        }
    }

    route("/categories/{categoryId}/products/{productId}") {
        delete {
            call.respond(HttpStatusCode.NotImplemented)

        }
    }

    route("/categories/{categoryId}/products/{productId}") {
        get {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "price" : 6.0274563,
              "name" : "name",
              "discountPrice" : 1.4658129,
              "description" : "description",
              "id" : 0,
              "type" : "type",
              "categoryId" : 5,
              "status" : "visible"
            }"""

            when (exampleContentType) {
                "application/json" -> call.respond(exampleContentString)
                else -> call.respondText(exampleContentString)
            }

        }
    }

    route("/products/{productId}/allergens") {
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

    route("/categories/{categoryId}/products/{productId}") {
        patch {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "price" : 6.0274563,
              "name" : "name",
              "discountPrice" : 1.4658129,
              "description" : "description",
              "id" : 0,
              "type" : "type",
              "categoryId" : 5,
              "status" : "visible"
            }"""

            when (exampleContentType) {
                "application/json" -> call.respond(exampleContentString)
                else -> call.respondText(exampleContentString)
            }

        }
    }

    route("/products/{productId}/allergens") {
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
