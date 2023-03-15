package com.example.dataofRoK.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.dataofRoK.KingdomViewModel
import com.example.rokdata.databinding.FragmentKingdomsBinding
import com.example.dataofRoK.adapter.KingdomAdapter



class KingdomsFragment: Fragment() {

    private var _binding: FragmentKingdomsBinding? = null
    private val binding get() = _binding!!
    private val viewModel: KingdomViewModel by activityViewModels()

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

        val kingdomAdapter = KingdomAdapter(viewModel.kingdoms.value!!)
        binding.kingdomsItemRecyclerview.adapter = kingdomAdapter

        viewModel.kingdoms.observe(viewLifecycleOwner){
            kingdomAdapter.submitList(it)
        }

    }

}