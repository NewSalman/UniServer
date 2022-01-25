package com.example.kaServer.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderedFood(
    @JsonProperty("id")
    val ID : Long,

    @JsonProperty("name")
    val Name : String,

    @JsonProperty("quantity")
    var Quantity : Int = 1,

    @JsonProperty("price")
    val Price : Int = 0)