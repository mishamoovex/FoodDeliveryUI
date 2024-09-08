package com.androidlead.fooddeliveryapp.data

import androidx.annotation.DrawableRes
import com.androidlead.fooddeliveryapp.R

data class ProductFlavorState(
    val name: String,
    val price: String,
    @DrawableRes val imgRes: Int
)

val ProductFlavorsData = listOf(
    ProductFlavorState(
        imgRes = R.drawable.img_cheese,
        name = "Chedder",
        price = "$0.79"
    ),
    ProductFlavorState(
        imgRes = R.drawable.img_bacon,
        name = "Bacon",
        price = "$0.52"
    ),
    ProductFlavorState(
        imgRes = R.drawable.img_onion,
        name = "Onion",
        price = "$0.28"
    )
)