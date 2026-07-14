package com.smartbikeguardian.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.smartbikeguardian.ui.theme.CardColor

@Composable
fun FeatureCard(

    modifier: Modifier = Modifier,

    title: String,

    onClick: () -> Unit = {}

) {

    Card(

        modifier = modifier
            .fillMaxWidth()
            .height(120.dp)
            .clickable {
                onClick()
            },

        shape = RoundedCornerShape(20.dp),

        colors = CardDefaults.cardColors(
            containerColor = CardColor
        )

    ) {

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {

            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )

        }

    }

}