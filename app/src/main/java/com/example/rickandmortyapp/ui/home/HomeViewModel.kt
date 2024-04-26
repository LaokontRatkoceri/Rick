package com.example.rickandmortyapp.ui.home

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.rickandmortyapp.domain.CharactersRepository
import com.example.rickandmortyapp.Data.model.Character // Import your custom Character class


class HomeViewModel: ViewModel() {
    val characterList = MutableLiveData<List<Character>?>()
    val repository = CharactersRepository()

    init {
        getCharcters()
    }

    private fun getCharcters() {
        val characters = repository.getCharacters()?.results // Assuming getCharacters() returns a data class containing a list of characters
        characterList.postValue(characters)

    }
}