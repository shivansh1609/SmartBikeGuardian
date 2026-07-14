package com.smartbikeguardian.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.smartbikeguardian.ui.theme.PrimaryGreen

@Composable
fun OnboardingDots(

    selectedIndex: Int,

    totalDots: Int

) {

    Row(

        horizontalArrangement = Arrangement.spacedBy(10.dp)

    ) {

        repeat(totalDots) { index ->

            androidx.compose.foundation.layout.Box(

                modifier = Modifier
                    .size(10.dp)
                    .clip(CircleShape)
                    .background(
                        if (index == selectedIndex)
                            PrimaryGreen
                        else
                            Color.LightGray
                    )

            )

        }

    }

}