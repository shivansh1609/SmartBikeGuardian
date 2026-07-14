package com.smartbikeguardian.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.smartbikeguardian.R
import com.smartbikeguardian.components.GreenButton
import com.smartbikeguardian.components.OnboardingDots
import com.smartbikeguardian.ui.theme.Background
import com.smartbikeguardian.ui.theme.PrimaryGreen
import com.smartbikeguardian.ui.theme.TextPrimary

@Composable
fun SplashScreen(
    onGetStarted: () -> Unit = {}
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
            .statusBarsPadding()
            .navigationBarsPadding()
            .padding(horizontal = 24.dp),

        horizontalAlignment = Alignment.Start
    ) {

        Spacer(modifier = Modifier.height(22.dp))

        Text(
            text = "SmartBike",
            color = PrimaryGreen,
            fontSize = 34.sp,
            fontWeight = FontWeight.ExtraBold
        )

        Text(
            text = "Guardian",
            color = TextPrimary,
            fontSize = 34.sp,
            fontWeight = FontWeight.ExtraBold
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Smarter Rides.",
            fontSize = 17.sp,
            color = Color.Gray
        )

        Text(
            text = "Safer Bikes.",
            fontSize = 17.sp,
            color = Color.Gray
        )

        Text(
            text = "Stronger Cities.",
            fontSize = 17.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(18.dp))

        Image(
            painter = painterResource(R.drawable.splash_hero),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(430.dp),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.height(16.dp))

        GreenButton(
            text = "Get Started",
            onClick = onGetStarted
        )

        Spacer(modifier = Modifier.height(14.dp))

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            OnboardingDots(
                selectedIndex = 0,
                totalDots = 4
            )
        }

        Spacer(modifier = Modifier.weight(1f))
    }
}