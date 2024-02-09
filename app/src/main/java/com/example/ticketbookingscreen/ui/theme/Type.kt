package com.example.ticketbookingscreen.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val RedHat = FontFamily(
    listOf(
        font(R.font.red_hot_display_regular, FontWeight.Normal),
        font(R.font.red_hot_display_medium, FontWeight.Medium),
        font(R.font.red_hot_display_semibold, FontWeight.SemiBold),
        font(R.font.red_hot_display_bold, FontWeight.Bold),
        )
)

val Typography = Typography(
   titleSmall = TextStyle(
       color = Color.White,
       fontSize = 17.sp,
       fontFamily = RedHat,
       fontWeight = FontWeight.SemiBold
   ),
   labelSmall = TextStyle(
       color = Color.White,
       fontSize = 14.sp,
       fontFamily = RedHat,
       fontWeight = FontWeight.Bold
   ),
   labelMedium = TextStyle(
       color = Color.White,
       fontSize = 17.sp,
       fontFamily = RedHat,
       fontWeight = FontWeight.SemiBold
   ),
   labelLarge = TextStyle(
       color = Yellow,
       fontSize = 29.sp,
       fontFamily = RedHat,
       fontWeight = FontWeight.SemiBold
   )
)