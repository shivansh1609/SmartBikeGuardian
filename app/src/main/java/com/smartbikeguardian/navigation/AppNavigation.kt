package com.smartbikeguardian.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.smartbikeguardian.screens.dashboard.DashboardScreen
import com.smartbikeguardian.screens.login.LoginScreen
import com.smartbikeguardian.screens.splash.SplashScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {

        // Splash Screen
        composable(Screen.Splash.route) {

            SplashScreen(

                onGetStarted = {

                    navController.navigate(Screen.Login.route) {

                        popUpTo(Screen.Splash.route) {
                            inclusive = true
                        }

                    }

                }

            )

        }

        // Login Screen
        composable(Screen.Login.route) {

            LoginScreen(

                onLoginClick = {

                    navController.navigate(Screen.Dashboard.route) {

                        popUpTo(Screen.Login.route) {
                            inclusive = true
                        }

                    }

                }

            )

        }

        // Dashboard Screen
        composable(Screen.Dashboard.route) {

            DashboardScreen()

        }

    }

}