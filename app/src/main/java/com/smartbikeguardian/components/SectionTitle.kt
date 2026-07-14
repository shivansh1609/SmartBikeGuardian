package com.smartbikeguardian.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun SectionTitle(

    title: String

) {

    Text(

        text = title,

        fontSize = 22.sp,

        fontWeight = FontWeight.Bold,

        color = Color.Black

    )

}