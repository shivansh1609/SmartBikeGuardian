package com.smartbikeguardian.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.smartbikeguardian.R
import com.smartbikeguardian.components.AppLogo
import com.smartbikeguardian.components.CustomTextField
import com.smartbikeguardian.components.GreenButton
import com.smartbikeguardian.components.SocialButton
import com.smartbikeguardian.ui.theme.Background
import com.smartbikeguardian.ui.theme.PrimaryGreen
import com.smartbikeguardian.ui.theme.TextPrimary

@Composable
fun LoginScreen(

    onLoginClick: () -> Unit = {},

    onGoogleClick: () -> Unit = {}

) {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(

        modifier = Modifier
            .fillMaxSize()
            .background(Background)
            .statusBarsPadding()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 24.dp),

        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Spacer(modifier = Modifier.height(32.dp))

        AppLogo()

        Spacer(modifier = Modifier.height(24.dp))

        Text(

            text = "Welcome Back",

            fontSize = 32.sp,

            fontWeight = FontWeight.Bold,

            color = TextPrimary

        )

        Spacer(modifier = Modifier.height(6.dp))

        Text(

            text = "Login to continue",

            color = Color.Gray,

            fontSize = 16.sp

        )

        Spacer(modifier = Modifier.height(32.dp))

        CustomTextField(

            value = email,

            onValueChange = {

                email = it

            },

            label = "Email"

        )

        Spacer(modifier = Modifier.height(16.dp))

        CustomTextField(

            value = password,

            onValueChange = {

                password = it

            },

            label = "Password",

            visualTransformation = PasswordVisualTransformation()

        )

        Spacer(modifier = Modifier.height(10.dp))

        Box(

            modifier = Modifier.fillMaxWidth(),

            contentAlignment = Alignment.CenterEnd

        ) {

            Text(

                text = "Forgot Password?",

                color = PrimaryGreen,

                fontWeight = FontWeight.SemiBold

            )

        }

        Spacer(modifier = Modifier.height(24.dp))

        GreenButton(

            text = "Login",

            onClick = onLoginClick

        )

        Spacer(modifier = Modifier.height(28.dp))

        Row(

            modifier = Modifier.fillMaxWidth(),

            verticalAlignment = Alignment.CenterVertically

        ) {

            HorizontalDivider(

                modifier = Modifier.weight(1f)

            )

            Text(

                text = " OR ",

                color = Color.Gray

            )

            HorizontalDivider(

                modifier = Modifier.weight(1f)

            )

        }

        Spacer(modifier = Modifier.height(24.dp))

        SocialButton(

            icon = R.drawable.google_logo,

            text = "Continue with Google",

            onClick = onGoogleClick

        )

        Spacer(modifier = Modifier.height(30.dp))

        Row {

            Text(

                text = "Don't have an account? "

            )

            Text(

                text = "Sign Up",

                color = PrimaryGreen,

                fontWeight = FontWeight.Bold

            )

        }

    }

}