package com.example.ketofoodapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.ketofoodapp.ui.screens.MainScreen
import com.example.ketofoodapp.ui.screens.Screen
import com.example.ketofoodapp.ui.screens.SearchResultScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Main.route
    ) {
        composable(
            route = Screen.Main.route
        ) {
            MainScreen(navController = navController)
        }

        composable(
            route = Screen.SearchResult.route
        ) {
            SearchResultScreen(navController = navController)
        }
    }
}