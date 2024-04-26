package com.example.rickandmortyapp.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.rickandmortyapp.Data.model.CharactersResponse
import com.example.rickandmortyapp.Data.source.ApiService
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import javax.security.auth.callback.Callback

class CharactersRepository()  {
    private var  service: ApiService

    init {
        val retrofit = Retrofit.Builder().baseUrl("https://rickandmortyapi.com/").build()

        service = retrofit.create(ApiService::class.java)
    }

    fun getCharacters(): CharactersResponse? {
        var charactersResponse : CharactersResponse? = null
        service.getCharacters().enqueue(object : retrofit2.Callback<CharactersResponse>{
            override fun onResponse(
                call: Call<CharactersResponse>,
                response: Response<CharactersResponse>
            ) {
                charactersResponse= response.body()
            }

            override fun onFailure(call: Call<CharactersResponse>, t: Throwable) {

            }

        })
        return charactersResponse
    }
}