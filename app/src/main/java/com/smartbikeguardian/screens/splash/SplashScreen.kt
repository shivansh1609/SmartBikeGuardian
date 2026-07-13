package com.smartbikeguardian.screens.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.smartbikeguardian.ui.theme.Background
import com.smartbikeguardian.ui.theme.PrimaryGreen

@Composable
fun SplashScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {

        Text(
            text = "🚲",
            fontSize = 80.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "SmartBike",
            fontSize = 34.sp,
            fontWeight = FontWeight.Bold,
            color = PrimaryGreen
        )

        Text(
            text = "Guardian",
            fontSize = 34.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Smarter Bikes.",
            style = MaterialTheme.typography.bodyLarge
        )

        Text(
            text = "Safer Rides.",
            style = MaterialTheme.typography.bodyLarge
        )

        Text(
            text = "Stronger Cities.",
            style = MaterialTheme.typography.bodyLarge
        )

    }

}