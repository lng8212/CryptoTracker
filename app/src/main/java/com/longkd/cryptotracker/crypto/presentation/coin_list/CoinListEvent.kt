package com.longkd.cryptotracker.crypto.presentation.coin_list

import com.longkd.cryptotracker.core.domain.util.NetworkError

/**
 * @Author: longkd
 * @Since: 17:37 - 11/5/25
 */
interface CoinListEvent {
    data class Error(val error: NetworkError) : CoinListEvent
}