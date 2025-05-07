package com.longkd.cryptotracker.crypto.presentation.coin_list

import androidx.compose.runtime.Immutable
import com.longkd.cryptotracker.crypto.presentation.models.CoinUi

/**
 * @Author: longkd
 * @Since: 23:24 - 6/5/25
 */
@Immutable
data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<CoinUi> = emptyList(),
    val selectedCoin: CoinUi? = null
)
