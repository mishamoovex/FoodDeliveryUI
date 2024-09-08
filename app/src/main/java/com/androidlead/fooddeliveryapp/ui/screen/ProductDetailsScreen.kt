package com.androidlead.fooddeliveryapp.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.androidlead.fooddeliveryapp.data.ProductPreviewState
import com.androidlead.fooddeliveryapp.ui.screen.components.ProductPreviewSection

@Composable
fun ProductDetailsScreen(
    modifier: Modifier = Modifier,
    productPreviewState: ProductPreviewState = ProductPreviewState()
) {
    Column(
        modifier = modifier
    ) {
        ProductPreviewSection(
            state = productPreviewState
        )
    }
}