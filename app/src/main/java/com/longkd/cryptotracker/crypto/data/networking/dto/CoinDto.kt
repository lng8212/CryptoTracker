package com.longkd.cryptotracker.crypto.data.networking.dto

import kotlinx.serialization.Serializable

/**
 * @Author: longkd
 * @Since: 23:18 - 7/5/25
 */

@Serializable
data class CoinDto(
    val id: String,
    val rank: Int,
    val name: String,
    val symbol: String,
    val marketCapUsd: Double,
    val priceUsd: Double,
    val changePercent24Hr: Double
)