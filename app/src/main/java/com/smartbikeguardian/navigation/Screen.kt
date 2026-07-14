package com.smartbikeguardian.navigation

sealed class Screen(val route: String) {

    object Splash : Screen("splash")

    object Login : Screen("login")

    object Dashboard : Screen("dashboard")

    object Parking : Screen("parking")

}