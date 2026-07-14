package com.smartbikeguardian.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.smartbikeguardian.R

@Composable
fun AppLogo() {

    Image(
        painter = painterResource(id = R.drawable.logo),
        contentDescription = "SmartBike Guardian Logo",
        modifier = Modifier.size(120.dp)
    )

}