package com.iremkryt.cryptoapp.ui.home

import com.iremkryt.cryptoapp.base.BaseRepository
import com.iremkryt.cryptoapp.network.ApiFactory
import javax.inject.Inject

class HomeRepository @Inject constructor(private val apiFactory: ApiFactory)
    : BaseRepository() {
    suspend fun getData(
        apiKey: String,
        limit: String
    ) = safeApiRequest {
        apiFactory.getData(apiKey,limit)
    }
}