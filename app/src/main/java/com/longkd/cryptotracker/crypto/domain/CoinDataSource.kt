package com.longkd.cryptotracker.crypto.domain

import com.longkd.cryptotracker.core.domain.util.NetworkError
import com.longkd.cryptotracker.core.domain.util.Result

/**
 * @Author: longkd
 * @Since: 22:56 - 7/5/25
 */
interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}