package com.example.ketofoodapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ketofoodapp.KetoFoodAPI
import com.example.ketofoodapp.RecipeBeanItem
import kotlinx.coroutines.launch

class SearchResultViewModel : ViewModel() {
    private val _searchResults = MutableLiveData<List<RecipeBeanItem>>()
    val searchResults: LiveData<List<RecipeBeanItem>> get() = _searchResults

    fun searchRecipes(query: String) {
        viewModelScope.launch {
            try {
                val recipeBean = KetoFoodAPI.loadRecipe(query)
                _searchResults.value = recipeBean
            } catch (e: Exception) {
                // TODO Handle the exception, e.g., show an error message
            }
        }
    }
}