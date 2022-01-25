package com.example.kaServer.controllers

import com.example.kaServer.models.Order
import com.example.kaServer.repositories.OrderRepository
import org.springframework.web.bind.annotation.*


@RestController
class OrderController {

    private lateinit var OrderRepo : OrderRepository

    init {
        OrderRepo = OrderRepository()
    }


    @GetMapping("/order")
    fun Index() : MutableList<Order> {
        val items = OrderRepo.GetItems()

        items.reverse()

        return items
    }

    @GetMapping("/order/{id}")
    fun GetItem(@PathVariable(value = "id", required = true) id : Int) : Order {
        return OrderRepo.GetItem(id)
    }

    @PostMapping("/order")
    fun CreateOrder(@RequestBody order: Order) {
        OrderRepo.AddItem(order)
        //println(order)
        //return OrderRepo.GetItems()
    }

    @DeleteMapping("/order/{id}")
    fun DeleteOrder(@PathVariable("id",  required = true)id : Int) {
        OrderRepo.DeleteItem(id)
    }

}