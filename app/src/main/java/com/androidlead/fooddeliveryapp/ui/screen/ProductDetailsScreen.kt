package com.androidlead.fooddeliveryapp.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.androidlead.fooddeliveryapp.data.ProductDescriptionData
import com.androidlead.fooddeliveryapp.data.ProductFlavorState
import com.androidlead.fooddeliveryapp.data.ProductFlavorsData
import com.androidlead.fooddeliveryapp.data.ProductNutritionData
import com.androidlead.fooddeliveryapp.data.ProductNutritionState
import com.androidlead.fooddeliveryapp.data.ProductPreviewState
import com.androidlead.fooddeliveryapp.ui.screen.components.FlavorSection
import com.androidlead.fooddeliveryapp.ui.screen.components.ProductDescriptionSection
import com.androidlead.fooddeliveryapp.ui.screen.components.ProductNutritionSection
import com.androidlead.fooddeliveryapp.ui.screen.components.ProductPreviewSection

@Composable
fun ProductDetailsScreen(
    modifier: Modifier = Modifier,
    productPreviewState: ProductPreviewState = ProductPreviewState(),
    productFlavors: List<ProductFlavorState> = ProductFlavorsData,
    productNutritionState: ProductNutritionState = ProductNutritionData,
    productDescription: String = ProductDescriptionData
) {
    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .verticalScroll(scrollState)
            .navigationBarsPadding()
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
            modifier = Modifier.height(16.dp)
        )
        ProductNutritionSection(
            state = productNutritionState,
            modifier = Modifier.padding(horizontal = 18.dp)
        )
        Spacer(
            modifier = Modifier.height(32.dp)
        )
        ProductDescriptionSection(
            productDescription = productDescription,
            modifier = Modifier
                .padding(horizontal = 18.dp)
                .padding(bottom = 24.dp)
        )
    }
}