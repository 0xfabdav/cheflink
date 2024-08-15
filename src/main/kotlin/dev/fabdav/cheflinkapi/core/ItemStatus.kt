package dev.fabdav.cheflinkapi.core

/**
*
* Values: Visible,Hidden,OutOfStock
*/
enum class ItemStatus(val value: kotlin.String) {

    Visible("visible"),

    Hidden("hidden"),

    OutOfStock("out_of_stock");

}