package com.example.ketofoodapp.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.navigation.NavController
import com.example.ketofoodapp.ui.screens.Screen


@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun SearchBarComponent(navController: NavController) {
    // Get the SoftwareKeyboardController
    val softwareKeyboardController = LocalSoftwareKeyboardController.current

    var searchText by remember { mutableStateOf("") }
    var activeState by remember { mutableStateOf(false) }

    SearchBar(
        modifier = Modifier.fillMaxWidth(),
        query = searchText,
        onQueryChange = { searchText = it },
        onSearch = {
            activeState = false
            softwareKeyboardController?.hide()

            navController.navigate(route = Screen.SearchResult.route)
        },
        active = activeState,
        onActiveChange = { activeState = it },
        placeholder = {
            Text("Search for recipes")
        },
        leadingIcon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = "Search icon")
        },
        trailingIcon = {
            if (activeState) {
                Icon(
                    modifier = Modifier.clickable {
                        if (searchText.isNotEmpty()) {
                            searchText = ""
                        } else {
                            activeState = false
                            softwareKeyboardController?.hide()
                        }
                    },
                    imageVector = Icons.Default.Clear,
                    contentDescription = "Clear icon"
                )
            }
        }
    ) {}
}
