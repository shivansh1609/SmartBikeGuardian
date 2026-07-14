package com.smartbikeguardian.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.smartbikeguardian.ui.theme.PrimaryGreen
import com.smartbikeguardian.ui.theme.White

@Composable
fun ActionButton(

    text: String,

    onClick: () -> Unit

) {

    Button(

        onClick = onClick,

        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp),

        shape = RoundedCornerShape(18.dp),

        colors = ButtonDefaults.buttonColors(

            containerColor = PrimaryGreen,

            contentColor = White

        )

    ) {

        Text(

            text = text,

            fontSize = 17.sp,

            fontWeight = FontWeight.SemiBold

        )

    }

}