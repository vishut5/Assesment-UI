package com.vishu.uifigma

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun NavGraph(navController: NavHostController, modifier: Modifier =  Modifier) {
    NavHost(navController, startDestination = "splash_screen") {
        composable("splash_screen") {
            SplashScreen(navController)
        }
        composable("onboard1") {
            OnBoard1(navController)
        }
        composable("onboard2") {
            OnBoard2(navController)
        }
        composable("home") {
            HomeScreen(navController)
        }

    }
}