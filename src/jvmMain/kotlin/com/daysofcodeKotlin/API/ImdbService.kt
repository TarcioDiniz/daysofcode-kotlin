package com.daysofcodeKotlin.API

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.Request

class ImdbService {

    private val IMDB_API_KEY = "k_3bf7dbph"

    fun getTop250Movies(): Top250Data? {
        val client: OkHttpClient = OkHttpClient.Builder().build()
        val request: Request = Request.Builder()
            .get()
            .url("https://imdb-api.com/API/Top250Movies/${IMDB_API_KEY}")
            .build()

        return try {
            val responsive = client.newCall(request).execute()
            if (responsive.isSuccessful){
                GsonBuilder().create().fromJson(responsive.body()?.string(), Top250Data::class.java)
            }else {
                null
            }
        } catch (e: Exception){
            null
        }
    }
}
