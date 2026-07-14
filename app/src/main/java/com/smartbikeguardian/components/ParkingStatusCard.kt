package com.smartbikeguardian.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.smartbikeguardian.ui.theme.CardColor
import com.smartbikeguardian.ui.theme.PrimaryGreen
import com.smartbikeguardian.ui.theme.TextPrimary
import com.smartbikeguardian.ui.theme.TextSecondary

@Composable
fun ParkingStatusCard(

    isParked: Boolean

) {

    val statusColor =
        if (isParked) PrimaryGreen else Color.Red

    val statusText =
        if (isParked) "Parked Safely"
        else "Not Parked"

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

        Row(

            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),

            verticalAlignment = Alignment.CenterVertically

        ) {

            Box(

                modifier = Modifier
                    .size(18.dp)
                    .background(
                        statusColor,
                        CircleShape
                    )

            )

            Spacer(modifier = Modifier.width(16.dp))

            Column {

                Text(

                    text = statusText,

                    fontWeight = FontWeight.Bold,

                    fontSize = 20.sp,

                    color = TextPrimary

                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(

                    text = if (isParked)
                        "Your bike is secure."
                    else
                        "No parking location found.",

                    color = TextSecondary,

                    fontSize = 14.sp

                )

            }

        }

    }

}