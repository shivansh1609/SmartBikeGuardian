package com.smartbikeguardian.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.smartbikeguardian.R
import com.smartbikeguardian.ui.theme.CardColor
import com.smartbikeguardian.ui.theme.PrimaryGreen
import com.smartbikeguardian.ui.theme.TextPrimary
import com.smartbikeguardian.ui.theme.TextSecondary

@Composable
fun BikeCard(

    bikeName: String,

    battery: Int,

    location: String,

    lastRide: String,

    bikeImage: Int = R.drawable.bike

) {

    Card(

        modifier = Modifier.fillMaxWidth(),

        shape = RoundedCornerShape(24.dp),

        colors = CardDefaults.cardColors(
            containerColor = CardColor
        ),

        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        )

    ) {

        Row(

            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp),

            verticalAlignment = Alignment.CenterVertically

        ) {

            Image(

                painter = painterResource(id = bikeImage),

                contentDescription = "Bike",

                modifier = Modifier.size(120.dp),

                contentScale = ContentScale.Fit

            )

            Spacer(modifier = Modifier.width(18.dp))

            Column(

                modifier = Modifier.weight(1f)

            ) {

                Text(

                    text = bikeName,

                    fontSize = 20.sp,

                    fontWeight = FontWeight.Bold,

                    color = TextPrimary

                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(

                    text = "Battery",

                    color = TextSecondary,

                    fontSize = 14.sp

                )

                Spacer(modifier = Modifier.height(4.dp))

                LinearProgressIndicator(

                    progress = { battery / 100f },

                    modifier = Modifier.fillMaxWidth(),

                    color = PrimaryGreen

                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(

                    text = "$battery%",

                    color = PrimaryGreen,

                    fontWeight = FontWeight.SemiBold

                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(

                    text = "📍 $location",

                    color = TextSecondary,

                    fontSize = 14.sp

                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(

                    text = "🕒 $lastRide",

                    color = TextSecondary,

                    fontSize = 14.sp

                )

            }

        }

    }

}