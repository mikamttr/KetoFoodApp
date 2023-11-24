package com.example.ketofoodapp

class RecipeBean : ArrayList<RecipeBeanItem>()

data class RecipeBeanItem(
    val cookTime: Int,
    val description: String,
    val id: String,
    val image: String,
    val ingredients: List<Ingredient>,
    val name: String,
    val prepareTime: Int,
    val servings: Int,
    val steps: List<String>,
    val tags: List<String>
)

data class Ingredient(
    val name: String,
    val servingSize: ServingSize
)

data class ServingSize(
    val desc: String,
    val grams: Double,
    val qty: Double,
    val scale: Double,
    val units: String
)