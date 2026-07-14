package com.smartbikeguardian.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.smartbikeguardian.ui.theme.CardColor
import com.smartbikeguardian.ui.theme.PrimaryGreen

@Composable
fun BottomNavBar(

    selectedItem: String = "Home",

    onHomeClick: () -> Unit = {},

    onParkingClick: () -> Unit = {},

    onAnalyticsClick: () -> Unit = {},

    onProfileClick: () -> Unit = {}

) {

    Card(

        modifier = Modifier.fillMaxWidth(),

        shape = RoundedCornerShape(20.dp),

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
                .padding(vertical = 18.dp),

            horizontalArrangement = Arrangement.SpaceEvenly

        ) {

            NavItem(
                title = "Home",
                selected = selectedItem == "Home",
                onClick = onHomeClick
            )

            NavItem(
                title = "Parking",
                selected = selectedItem == "Parking",
                onClick = onParkingClick
            )

            NavItem(
                title = "Analytics",
                selected = selectedItem == "Analytics",
                onClick = onAnalyticsClick
            )

            NavItem(
                title = "Profile",
                selected = selectedItem == "Profile",
                onClick = onProfileClick
            )

        }

    }

}

@Composable
private fun NavItem(

    title: String,

    selected: Boolean,

    onClick: () -> Unit

) {

    Text(

        text = title,

        color = if (selected) PrimaryGreen else Color.Gray,

        fontWeight = if (selected) FontWeight.Bold else FontWeight.Normal,

        modifier = Modifier.clickable {

            onClick()

        }

    )

}