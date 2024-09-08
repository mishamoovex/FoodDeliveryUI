package com.androidlead.fooddeliveryapp.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.androidlead.fooddeliveryapp.data.ProductFlavorState
import com.androidlead.fooddeliveryapp.data.ProductFlavorsData
import com.androidlead.fooddeliveryapp.data.ProductNutritionData
import com.androidlead.fooddeliveryapp.data.ProductNutritionState
import com.androidlead.fooddeliveryapp.data.ProductPreviewState
import com.androidlead.fooddeliveryapp.ui.screen.components.FlavorSection
import com.androidlead.fooddeliveryapp.ui.screen.components.ProductNutritionSection
import com.androidlead.fooddeliveryapp.ui.screen.components.ProductPreviewSection

@Composable
fun ProductDetailsScreen(
    modifier: Modifier = Modifier,
    productPreviewState: ProductPreviewState = ProductPreviewState(),
    productFlavors: List<ProductFlavorState> = ProductFlavorsData,
    productNutritionState: ProductNutritionState = ProductNutritionData
) {
    Column(
        modifier = modifier
    ) {
        ProductPreviewSection(
            state = productPreviewState
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        FlavorSection(
            data = productFlavors,
            modifier = Modifier.padding(horizontal = 18.dp)
        )
        Spacer(
            modifier = Modifier.height(8.dp)
        )
        ProductNutritionSection(
            state = productNutritionState,
            modifier = Modifier.padding(horizontal = 18.dp)
        )
    }
}