package com.longkd.cryptotracker.crypto.data.networking

import com.longkd.cryptotracker.BuildConfig
import com.longkd.cryptotracker.core.data.networking.constructUrl
import com.longkd.cryptotracker.core.data.networking.safeCall
import com.longkd.cryptotracker.core.domain.util.NetworkError
import com.longkd.cryptotracker.core.domain.util.Result
import com.longkd.cryptotracker.core.domain.util.map
import com.longkd.cryptotracker.crypto.data.mappers.toCoin
import com.longkd.cryptotracker.crypto.data.networking.dto.CoinResponseDto
import com.longkd.cryptotracker.crypto.domain.Coin
import com.longkd.cryptotracker.crypto.domain.CoinDataSource
import io.ktor.client.HttpClient
import io.ktor.client.request.get

/**
 * @Author: longkd
 * @Since: 23:14 - 7/5/25
 */
class RemoteCoinDataSource(
    private val httpClient: HttpClient
) : CoinDataSource {
    override suspend fun getCoins(): Result<List<Coin>, NetworkError> {
        return safeCall<CoinResponseDto> {
            httpClient.get(
                urlString = constructUrl("?apiKey=${BuildConfig.API_KEY}")
            )
        }.map { response ->
            response.data.map {
                it.toCoin()
            }
        }
    }
}