package dev.fabdav.cheflinkapi

import dev.fabdav.cheflinkapi.plugins.configureDatabases
import dev.fabdav.cheflinkapi.plugins.configureHTTP
import dev.fabdav.cheflinkapi.plugins.configureRouting
import dev.fabdav.cheflinkapi.plugins.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureHTTP()
    configureSerialization()
    configureDatabases()
    configureRouting()
}
