package com.smartbikeguardian.screens.parking

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import com.smartbikeguardian.components.ActionButton
import com.smartbikeguardian.components.InfoCard
import com.smartbikeguardian.components.LocationCard
import com.smartbikeguardian.components.ParkingStatusCard
import com.smartbikeguardian.ui.theme.Background
import com.smartbikeguardian.ui.theme.CardColor
import com.smartbikeguardian.ui.theme.PrimaryGreen
import com.smartbikeguardian.ui.theme.TextPrimary

@Composable
fun ParkingScreen(

    isParked: Boolean = true,

    location: String = "IIIT Bhagalpur",

    parkingDuration: String = "00:42:18",

    onLocateBike: () -> Unit = {},

    onSaveParking: () -> Unit = {}

) {

    Column(

        modifier = Modifier
            .fillMaxSize()
            .background(Background)
            .statusBarsPadding()
            .verticalScroll(rememberScrollState())
            .padding(20.dp)

    ) {

        Text(

            text = "Parking",

            fontSize = 30.sp,

            fontWeight = FontWeight.Bold,

            color = TextPrimary

        )

        Spacer(modifier = Modifier.height(24.dp))

        ParkingStatusCard(

            isParked = isParked

        )

        Spacer(modifier = Modifier.height(16.dp))

        LocationCard(

            location = location

        )

        Spacer(modifier = Modifier.height(16.dp))

        InfoCard(

            title = "Parking Duration",

            value = parkingDuration

        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(

            text = "Map",

            fontWeight = FontWeight.Bold,

            fontSize = 20.sp

        )

        Spacer(modifier = Modifier.height(10.dp))

        Card(

            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp),

            shape = RoundedCornerShape(20.dp),

            colors = CardDefaults.cardColors(

                containerColor = CardColor

            )

        ) {

            Box(

                modifier = Modifier.fillMaxSize(),

                contentAlignment = Alignment.Center

            ) {

                Column(

                    horizontalAlignment = Alignment.CenterHorizontally

                ) {

                    Text(

                        text = "Google Maps",

                        color = PrimaryGreen,

                        fontWeight = FontWeight.Bold,

                        fontSize = 22.sp

                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(

                        text = "Coming Soon",

                        color = Color.Gray

                    )

                }

            }

        }

        Spacer(modifier = Modifier.height(24.dp))

        ActionButton(

            text = "Locate Bike",

            onClick = onLocateBike

        )

        Spacer(modifier = Modifier.height(14.dp))

        ActionButton(

            text = "Save Parking",

            onClick = onSaveParking

        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(

            text = "Recent Parking",

            fontWeight = FontWeight.Bold,

            fontSize = 20.sp

        )

        Spacer(modifier = Modifier.height(12.dp))

        Text("📍 Main Gate • Today • 10:20 AM")

        Spacer(modifier = Modifier.height(8.dp))

        Text("📍 Library • Yesterday • 05:45 PM")

        Spacer(modifier = Modifier.height(30.dp))

    }

}