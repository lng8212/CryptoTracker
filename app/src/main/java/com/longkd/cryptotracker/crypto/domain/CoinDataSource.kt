package com.longkd.cryptotracker.crypto.domain

import com.longkd.cryptotracker.core.domain.util.NetworkError
import com.longkd.cryptotracker.core.domain.util.Result
import java.time.ZonedDateTime

/**
 * @Author: longkd
 * @Since: 22:56 - 7/5/25
 */
interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
    suspend fun getCoinHistory(
        coinId: String,
        start: ZonedDateTime,
        end: ZonedDateTime
    ): Result<List<CoinPrice>, NetworkError>
}