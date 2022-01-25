package com.example.kaServer.repositories

import com.example.kaServer.models.Order

interface IOrderRepository {
    fun GetItems() : MutableList<Order>
    fun GetItem(ID : Int) : Order
    fun AddItem(order: Order)
    fun DeleteItem(ID: Int)
}