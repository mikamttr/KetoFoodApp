package com.example.ketofoodapp

import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.Request

object KetoFoodAPI {

    val gson = Gson()
    val client = OkHttpClient()

    fun loadRecipe(recipeName: String): RecipeBean {

        var url: String = "https://low-carb-recipes.p.rapidapi.com/search?name=$recipeName&limit=10"
        val json: String = sendGet(url)

        return gson.fromJson(json, RecipeBean::class.java)
    }


    fun sendGet(url: String): String {

        val request = Request.Builder()
            .url(url)
            .get()
            .addHeader("X-RapidAPI-Key", "907a64550cmshb0b985c7225448dp180228jsnab662a0c5072")
            .addHeader("X-RapidAPI-Host", "low-carb-recipes.p.rapidapi.com")
            .build()

        return client.newCall(request).execute().use {
            if (!it.isSuccessful) {
                throw Exception("Réponse du serveur incorrect :${it.code}")
            }
            //Résultat de la requête
            it.body.string()
        }
    }
}