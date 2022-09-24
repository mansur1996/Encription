package com.mrmansur.encription.network.service

import com.mrmansur.encription.model.Card
import retrofit2.Call
import retrofit2.http.*

interface CardService {

    @Headers("Content-type:application/json")

    @GET("api/cards")
    fun getCards(): Call<ArrayList<Card>>

    @GET("api/cards/{id}")
    fun getCardById(@Path("id") id: Int): Call<Card>

    @POST("api/cards")
    fun createCard(@Body card: Card): Call<Card>

}