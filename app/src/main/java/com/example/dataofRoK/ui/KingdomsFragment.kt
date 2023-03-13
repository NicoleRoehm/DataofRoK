package com.example.dataofRoK.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.dataofRoK.MainViewModel
import com.example.dataofRoK.adapter.KingdomAdapter
import com.example.dataofRoK.data.model.Kingdoms
import com.example.rokdata.databinding.FragmentKingdomsBinding


class KingdomsFragment: Fragment() {

    private var _binding: FragmentKingdomsBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentKingdomsBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val kingdomAdapter = KingdomAdapter()
        binding.kingdomsItemRecyclerview.adapter = kingdomAdapter

        viewModel.kingdoms.observe(viewLifecycleOwner){
            kingdomAdapter.submitList(it)
        }

    }

}