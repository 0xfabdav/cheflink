package dev.fabdav.cheflinkapi.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.CategoryRoutes() {
    route("/categories/{categoryId}") {
        delete {
            call.respond(HttpStatusCode.NotImplemented)

        }
    }

    route("/categories-products") {
        get {
            val exampleContentType = "application/json"
            val exampleContentString = """[ {
              "name" : "name",
              "id" : 0,
              "products" : [ {
                "name" : "name",
                "id" : 6
              }, {
                "name" : "name",
                "id" : 6
              } ]
            }, {
              "name" : "name",
              "id" : 0,
              "products" : [ {
                "name" : "name",
                "id" : 6
              }, {
                "name" : "name",
                "id" : 6
              } ]
            } ]"""

            when (exampleContentType) {
                "application/json" -> call.respond(exampleContentString)
                else -> call.respondText(exampleContentString)
            }

        }
    }

    route("/categories/{categoryId}") {
        get {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "name" : "name",
              "description" : "description",
              "id" : 0,
              "type" : "type",
              "status" : "visible"
            }"""

            when (exampleContentType) {
                "application/json" -> call.respond(exampleContentString)
                else -> call.respondText(exampleContentString)
            }

        }
    }

    route("/categories/{categoryId}") {
        patch {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "name" : "name",
              "description" : "description",
              "id" : 0,
              "type" : "type",
              "status" : "visible"
            }"""

            when (exampleContentType) {
                "application/json" -> call.respond(exampleContentString)
                else -> call.respondText(exampleContentString)
            }

        }
    }

    route("/categories") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "name" : "name",
              "description" : "description",
              "id" : 0,
              "type" : "type",
              "status" : "visible"
            }"""

            when (exampleContentType) {
                "application/json" -> call.respond(exampleContentString)
                else -> call.respondText(exampleContentString)
            }

        }
    }

}
