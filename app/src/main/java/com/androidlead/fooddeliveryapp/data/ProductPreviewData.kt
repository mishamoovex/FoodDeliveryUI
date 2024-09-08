package com.androidlead.fooddeliveryapp.data

import androidx.annotation.DrawableRes
import com.androidlead.fooddeliveryapp.R

data class ProductHighlight(
    val text: String,
    val type: ProductHighlightType
)

enum class ProductHighlightType {
    PRIMARY, SECONDARY
}

data class ProductPreviewState(
    val headline: String = "Mr. Cheezy",
    @DrawableRes val productImg: Int = R.drawable.img_burger,
    val highlights: List<ProductHighlight> = listOf(
        ProductHighlight(
            text = "Classic Taste",
            type = ProductHighlightType.SECONDARY
        ),
        ProductHighlight(
            text = "Bestseller",
            type = ProductHighlightType.PRIMARY
        )
    )
)