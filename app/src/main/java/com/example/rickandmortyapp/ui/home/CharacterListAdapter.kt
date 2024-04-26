package com.example.rickandmortyapp.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmortyapp.databinding.FragmentHomeBinding
import com.example.rickandmortyapp.databinding.ItemCardBinding

class CharacterListAdapter(): RecyclerView.Adapter<CharacterListAdapter.ViewHolder>() {

    inner class ViewHolder(var binding: ItemCardBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemCardBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = 10

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }
}