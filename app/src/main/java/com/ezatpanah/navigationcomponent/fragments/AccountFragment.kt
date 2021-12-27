package com.ezatpanah.navigationcomponent.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.ezatpanah.navigationcomponent.R
import com.ezatpanah.navigationcomponent.databinding.FragmentAccountBinding
import com.ezatpanah.navigationcomponent.model.User


class AccountFragment : Fragment() {

    private lateinit var binding: FragmentAccountBinding
   private lateinit var  user :User
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        user = it.getParcelable("user")!!

        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentAccountBinding.inflate(inflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            tvName.text=user.name
            tvEmail.text=user.email
        }
    }
}