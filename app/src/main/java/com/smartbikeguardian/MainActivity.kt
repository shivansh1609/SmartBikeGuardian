package com.smartbikeguardian

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.smartbikeguardian.navigation.AppNavigation
import com.smartbikeguardian.ui.theme.SmartBikeGuardianTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SmartBikeGuardianTheme {

                AppNavigation()

            }
        }
    }
}