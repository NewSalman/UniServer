package com.example.kaServer.repositories

import com.example.kaServer.models.Order
import com.example.kaServer.testData.Orders

open class OrderRepository : IOrderRepository {

    override fun GetItems(): MutableList<Order> = Orders

    override fun GetItem(ID: Int): Order = Orders[ID]

    override fun AddItem(order: Order) {
        order.ID = Orders.size.toLong()
        Orders.add(order)
    }

    override fun DeleteItem(ID: Int) {
        val order = Orders.find { it.ID == ID.toLong() }

        order?.let {
            Orders.remove(it)
        }
    }
}