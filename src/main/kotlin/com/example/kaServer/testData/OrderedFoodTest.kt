package com.example.kaServer.testData

import com.example.kaServer.models.OrderedFood
import kotlin.random.Random
import kotlin.random.nextInt


val ListFood = mutableListOf(
    OrderedFood(0, "Sate Usus", 5, 3000),
    OrderedFood(1, "Sate Kulit", 5, 3000),
    OrderedFood(2, "Ceker", 5, 3000),
    OrderedFood(3, "Kepala", 5, 3000),
    OrderedFood(4, "Martabak Tahu", 5, 3000),
    OrderedFood(5, "Sate Yakitori", 5, 3000),
    OrderedFood(6, "Sate Odeng", 5, 3000),
    OrderedFood(7, "Sate Sosis", 5, 3000),
    OrderedFood(8, "Sate Bakso", 5, 3000),
    OrderedFood(9, "Sate Fishrool", 5, 3000),
    OrderedFood(10, "Dumpling", 5, 3000),
    OrderedFood(11, "Jahe", 2, 7000),
    OrderedFood(12, "Teh", 4, 3000),
)


fun RandomFoodPlease() : MutableList<OrderedFood> {
    val ListOrder = mutableListOf<OrderedFood>()
    for (i in 0..4) {
        ListOrder.add(ListFood.get(Random.nextInt(12)))
    }

    return ListOrder
}