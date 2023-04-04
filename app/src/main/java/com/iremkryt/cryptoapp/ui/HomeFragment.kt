package com.iremkryt.cryptoapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.iremkryt.cryptoapp.R
import com.iremkryt.cryptoapp.base.BaseFragment
import com.iremkryt.cryptoapp.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(
    FragmentHomeBinding::inflate
) {
    override val viewModel by viewModels<HomeViewModel>()

    override fun onCreateFinished() {

    }

    override fun initializeListeners() {

    }

    override fun observeEvents() {

    }

}