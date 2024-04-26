package com.example.rickandmortyapp.Data.source

import com.example.rickandmortyapp.Data.model.CharactersResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("api/characters")
    fun getCharacters() : Call<CharactersResponse>
}

