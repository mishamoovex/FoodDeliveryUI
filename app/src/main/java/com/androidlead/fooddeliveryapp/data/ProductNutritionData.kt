package com.androidlead.fooddeliveryapp.data

data class ProductNutritionState(
    val calories: Calories,
    val nutrition: List<NutritionState>
)

data class Calories(
    val value: String,
    val unit: String
)

data class NutritionState(
    val amount: String,
    val unit: String,
    val title: String
)

val ProductNutritionData = ProductNutritionState(
    calories = Calories(
        value = "650",
        unit = "Cal"
    ),
    nutrition = listOf(
        NutritionState(
            amount = "35",
            unit = "g",
            title = "Total Fat (45% DV)"
        ),
        NutritionState(
            amount = "43",
            unit = "g",
            title = "Total Carbs (16% DV)"
        ),
        NutritionState(
            amount = "36",
            unit = "g",
            title = "Protein"
        )
    )
)



