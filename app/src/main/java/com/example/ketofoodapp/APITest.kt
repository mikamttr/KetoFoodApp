package com.example.ketofoodapp

fun main() {
    var api = KetoFoodAPI
    var recipeBean = api.loadRecipe("")

    for (recipeItem in recipeBean) {
        println(recipeItem)
    }
}