package com.example.gymsaround.ui.screen

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument


@Composable
fun navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home"){

        composable("home"){
            CardGyms(navController)
        }
        composable("details/{gymId}", arguments = listOf(
            navArgument("gymId") {
                type = NavType.StringType
                nullable = true
            }
        )){
            val gymId = it.arguments?.getString("gymId")
            GymItem(gymId!!.toInt())
        }



    }
}
