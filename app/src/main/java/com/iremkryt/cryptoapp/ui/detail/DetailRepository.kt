package com.iremkryt.cryptoapp.ui.detail

import com.iremkryt.cryptoapp.base.BaseRepository
import com.iremkryt.cryptoapp.network.ApiFactory
import javax.inject.Inject

class DetailRepository @Inject constructor(private val apiFactory: ApiFactory): BaseRepository() {
    suspend fun getDetail(
        apiKey: String,
        symbol: String
    ) = safeApiRequest {
        apiFactory.getDetail(apiKey, symbol)
    }
}