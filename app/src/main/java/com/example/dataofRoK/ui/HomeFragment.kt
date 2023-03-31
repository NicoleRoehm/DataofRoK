package com.example.dataofRoK.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.DataofRoK.R
import com.example.DataofRoK.databinding.FragmentHomeBinding
import com.example.dataofRoK.LogInViewModel




class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val viewModel: LogInViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater,container,false)
       val view = binding.root
        binding.homeFragmentNametext.text
        binding.homeFragmentWelcomeText
        binding.homeFragmentProfilpicture
        binding.homeFragmentIdtext.text = viewModel.iD.value.toString()

        binding.homeFragmentKingdoms.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_kingdomsFragment)
        }
        binding.homeFragmentMembers.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_membersFragment)
        }
        binding.homeFragmentProfil.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_profilFragment)
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }
}

