package com.longkd.cryptotracker.crypto.data.networking.dto

import kotlinx.serialization.Serializable

/**
 * @Author: longkd
 * @Since: 23:27 - 7/5/25
 */
@Serializable
data class CoinResponseDto(
    val data: List<CoinDto>
)