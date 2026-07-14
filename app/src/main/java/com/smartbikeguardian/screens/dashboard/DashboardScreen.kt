package com.smartbikeguardian.screens.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.smartbikeguardian.components.BikeCard
import com.smartbikeguardian.components.BottomNavBar
import com.smartbikeguardian.components.FeatureCard
import com.smartbikeguardian.components.SectionTitle
import com.smartbikeguardian.ui.theme.Background
import com.smartbikeguardian.ui.theme.TextPrimary

@Composable
fun DashboardScreen(

    userName: String = "Shivansh",

    bikeName: String = "Hero Xtreme 125R",

    battery: Int = 82,

    location: String = "IIIT Bhagalpur",

    lastRide: String = "Today"

) {

    Column(

        modifier = Modifier
            .fillMaxSize()
            .background(Background)
            .statusBarsPadding()
            .verticalScroll(rememberScrollState())
            .padding(20.dp)

    ) {

        Spacer(modifier = Modifier.height(12.dp))

        Text(

            text = "Hello, $userName 👋",

            fontSize = 30.sp,

            fontWeight = FontWeight.Bold,

            color = TextPrimary

        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(

            text = "Welcome Back",

            fontSize = 16.sp

        )

        Spacer(modifier = Modifier.height(28.dp))

        SectionTitle(

            title = "Your Smart Bike"

        )

        Spacer(modifier = Modifier.height(12.dp))

        BikeCard(

            bikeName = bikeName,

            battery = battery,

            location = location,

            lastRide = lastRide

        )

        Spacer(modifier = Modifier.height(28.dp))

        SectionTitle(

            title = "Quick Actions"

        )

        Spacer(modifier = Modifier.height(12.dp))

        Row(

            horizontalArrangement = Arrangement.spacedBy(14.dp),

            modifier = Modifier.fillMaxWidth()

        ) {

            FeatureCard(

                modifier = Modifier.weight(1f),

                title = "Parking"

            )

            FeatureCard(

                modifier = Modifier.weight(1f),

                title = "Maintenance"

            )

        }

        Spacer(modifier = Modifier.height(14.dp))

        Row(

            horizontalArrangement = Arrangement.spacedBy(14.dp),

            modifier = Modifier.fillMaxWidth()

        ) {

            FeatureCard(

                modifier = Modifier.weight(1f),

                title = "Analytics"

            )

            FeatureCard(

                modifier = Modifier.weight(1f),

                title = "Report"

            )

        }

        Spacer(modifier = Modifier.height(30.dp))

        BottomNavBar(

            selectedItem = "Home"

        )

        Spacer(modifier = Modifier.height(20.dp))

    }

}