package com.smartbikeguardian.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(

    primary = PrimaryGreen,
    secondary = DarkGreen,
    tertiary = LightGreen,

    background = Background,
    surface = White,

    onPrimary = White,
    onSecondary = White,
    onTertiary = White,

    onBackground = TextPrimary,
    onSurface = TextPrimary

)

private val LightColorScheme = lightColorScheme(

    primary = PrimaryGreen,
    secondary = DarkGreen,
    tertiary = PrimaryGreen,

    background = Background,
    surface = White,

    onPrimary = White,
    onSecondary = White,
    onTertiary = White,

    onBackground = TextPrimary,
    onSurface = TextPrimary

)

@Composable
fun SmartBikeGuardianTheme(

    darkTheme: Boolean = false,

    content: @Composable () -> Unit

) {

    val colorScheme = if (darkTheme)
        DarkColorScheme
    else
        LightColorScheme

    MaterialTheme(

        colorScheme = colorScheme,

        typography = Typography,

        content = content

    )
}