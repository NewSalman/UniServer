package com.example.kaServer.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Order(
    @JsonProperty("id")
    var ID : Long,

    @JsonProperty("foods")
    var Foods : MutableList<OrderedFood>,

    @JsonProperty("totalPrice")
    var TotalPrice : Int = 0,

    @JsonProperty("name")
    val Name : String,

    @JsonProperty("done")
    var Done : Boolean = false,

    @JsonProperty("sitNumber")
    val SitNumber : Int) {
}