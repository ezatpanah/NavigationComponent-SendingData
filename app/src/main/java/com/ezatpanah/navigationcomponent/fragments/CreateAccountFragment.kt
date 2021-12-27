package com.ezatpanah.navigationcomponent.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import com.ezatpanah.navigationcomponent.R
import com.ezatpanah.navigationcomponent.databinding.FragmentCreateAccountBinding
import com.ezatpanah.navigationcomponent.model.User


class CreateAccountFragment : Fragment() {

    private lateinit var binding: FragmentCreateAccountBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreateAccountBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            btnCreateAccount.setOnClickListener {
                val name = edtName.text.toString().trim()
                val email= edtEmail.text.toString().trim()

                if(name.isNotEmpty()&& email.isNotEmpty()){

                    val user= User(name,email)
                    val bundle = bundleOf("user" to user)

                    view.findNavController().navigate(R.id.accountFragment,bundle)
                }
                else{
                    Toast.makeText(requireContext(), "Enter Name and Email", Toast.LENGTH_SHORT).show()
                }

            }

            btnCancel.setOnClickListener {
                activity?.onBackPressed()
            }
        }
    }
}