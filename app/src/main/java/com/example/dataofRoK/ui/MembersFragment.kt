package com.example.dataofRoK.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.DataofRoK.R
import com.example.DataofRoK.databinding.FragmentMembersBinding
import com.example.dataofRoK.MembersViewModel


class MembersFragment: Fragment() {

    private var _binding: FragmentMembersBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MembersViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMembersBinding.inflate(inflater,container,false)

        binding.membersFragmentHomeButton.setOnClickListener {
            findNavController().navigate(R.id.action_membersFragment_to_homeFragment)
        }
        binding.membersFragmentProfilButton.setOnClickListener {
            findNavController().navigate(R.id.action_membersFragment_to_profilFragment)
        }
        binding.membersFragmentKingdomsicon.setOnClickListener {
            findNavController().navigate(R.id.action_membersFragment_to_kingdomsFragment)
        }
        val view = binding.root


        return view
    }
    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }


}
