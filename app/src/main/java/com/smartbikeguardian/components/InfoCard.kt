package com.smartbikeguardian.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.smartbikeguardian.ui.theme.CardColor
import com.smartbikeguardian.ui.theme.PrimaryGreen
import com.smartbikeguardian.ui.theme.TextPrimary
import com.smartbikeguardian.ui.theme.TextSecondary

@Composable
fun InfoCard(

    title: String,

    value: String

) {

    Card(

        modifier = Modifier.fillMaxWidth(),

        shape = RoundedCornerShape(20.dp),

        colors = CardDefaults.cardColors(
            containerColor = CardColor
        ),

        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        )

    ) {

        Column(

            modifier = Modifier.padding(20.dp)

        ) {

            Text(

                text = title,

                fontSize = 14.sp,

                color = TextSecondary

            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(

                text = value,

                fontSize = 24.sp,

                fontWeight = FontWeight.Bold,

                color = PrimaryGreen

            )

        }

    }

}