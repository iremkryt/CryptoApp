package com.iremkryt.cryptoapp.ui.home

import androidx.fragment.app.viewModels
import com.iremkryt.cryptoapp.base.BaseFragment
import com.iremkryt.cryptoapp.databinding.FragmentHomeBinding
import com.iremkryt.cryptoapp.utils.Constant.API_KEY
import com.iremkryt.cryptoapp.utils.Constant.LIMIT
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(
    FragmentHomeBinding::inflate
) {
    override val viewModel by viewModels<HomeViewModel>()

    override fun onCreateFinished() {
        viewModel.getData(API_KEY, LIMIT)
    }

    override fun initializeListeners() {

    }

    override fun observeEvents() {

    }

}