package com.longkd.cryptotracker.crypto.presentation.coin_list

import com.longkd.cryptotracker.crypto.presentation.models.CoinUi

/**
 * @Author: longkd
 * @Since: 17:06 - 11/5/25
 */
sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi) : CoinListAction
}