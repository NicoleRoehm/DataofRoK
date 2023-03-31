package com.example.dataofRoK.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.DataofRoK.R
import com.example.DataofRoK.databinding.FragmentLoginBinding
import com.example.dataofRoK.LogInViewModel


class LogInFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    private  val viewModel : LogInViewModel by viewModels ()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater,container,false)
        val view = binding.root

        binding.loginFragmentUsernameedit.editText
        binding.loginFragmentPassword.text
        binding.loginFragmentButton.setOnClickListener {
            findNavController().navigate(R.id.action_logInFragment_to_homeFragment)
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }
}