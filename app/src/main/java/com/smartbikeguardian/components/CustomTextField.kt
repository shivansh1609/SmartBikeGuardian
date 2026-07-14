package com.smartbikeguardian.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.smartbikeguardian.ui.theme.PrimaryGreen

@Composable
fun CustomTextField(

    value: String,

    onValueChange: (String) -> Unit,

    label: String,

    visualTransformation: VisualTransformation = VisualTransformation.None

) {

    OutlinedTextField(

        value = value,

        onValueChange = onValueChange,

        label = { Text(label) },

        modifier = Modifier.fillMaxWidth(),

        singleLine = true,

        shape = RoundedCornerShape(16.dp),

        visualTransformation = visualTransformation,

        colors = OutlinedTextFieldDefaults.colors(

            focusedBorderColor = PrimaryGreen,

            unfocusedBorderColor = Color(0xFFD9D9D9),

            cursorColor = PrimaryGreen

        )

    )

}