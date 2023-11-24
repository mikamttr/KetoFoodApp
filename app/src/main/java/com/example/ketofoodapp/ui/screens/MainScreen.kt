package com.example.ketofoodapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ketofoodapp.ui.components.SearchBarComponent
import com.example.compose.AppTheme


@Composable
fun MainScreen(navController: NavController) {
    Column{
        SearchBarComponent(navController = navController)
        Text(text = "Home page")
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun MainScreenPreview() {
    AppTheme {
        MainScreen(navController = rememberNavController())
    }
}