package com.example.dataofRoK.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.dataofRoK.MembersViewModel
import com.example.rokdata.databinding.FragmentMembersBinding

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
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    }
}
