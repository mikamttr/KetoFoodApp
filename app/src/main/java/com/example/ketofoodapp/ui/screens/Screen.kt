package com.example.ketofoodapp.ui.screens

sealed class Screen (val route: String){
    object Main: Screen(route = "main_screen")
    object SearchResult: Screen(route = "searchresult_screen")
}
