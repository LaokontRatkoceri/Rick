package com.example.rickandmortyapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rickandmortyapp.databinding.FragmentHomeBinding

class HomeFragment :Fragment(){

    private lateinit var adapter: CharacterListAdapter
    private lateinit var binding: FragmentHomeBinding

    val viewModel: HomeViewModel by viewModels<HomeViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.characterList.observe(viewLifecycleOwner){
            println("Characters ${it?.size}")
        }
        adapter = CharacterListAdapter()
        binding.ListChar.adapter = adapter

        binding.ListChar.layoutManager = LinearLayoutManager(requireActivity())
    }
}