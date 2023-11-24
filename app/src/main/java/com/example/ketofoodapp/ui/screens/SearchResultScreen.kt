package com.example.ketofoodapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.compose.AppTheme


@Composable
fun SearchResultScreen(
    navController : NavController
) {
    Column{
        /*SearchBarComponent()*/
        Button(
            onClick = {
                navController.popBackStack()
            },
            contentPadding = ButtonDefaults.ButtonWithIconContentPadding
        ) {
            Icon(
                Icons.Filled.ArrowBack,
                contentDescription = "Localized description",
                modifier = Modifier.size(ButtonDefaults.IconSize)
            )
            /*Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text(text = "Back to menu")*/
        }

        Text(text = "Search Result")
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun SearchResultScreenPreview() {
    AppTheme {
        SearchResultScreen(navController = rememberNavController())
    }
}