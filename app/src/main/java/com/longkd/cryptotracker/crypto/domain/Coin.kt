package com.longkd.cryptotracker.crypto.domain

/**
 * @Author: longkd
 * @Since: 22:40 - 6/5/25
 */

data class Coin(
    val id: String,
    val rank: Int,
    val name: String,
    val symbol: String,
    val marketCapUsd: Double,
    val priceUsd: Double,
    val changePercent24Hr: Double
)