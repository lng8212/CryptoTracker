package com.longkd.cryptotracker.crypto.data.mappers

import com.longkd.cryptotracker.crypto.data.networking.dto.CoinDto
import com.longkd.cryptotracker.crypto.data.networking.dto.CoinPriceDto
import com.longkd.cryptotracker.crypto.domain.Coin
import com.longkd.cryptotracker.crypto.domain.CoinPrice
import java.time.Instant
import java.time.ZoneId

/**
 * @Author: longkd
 * @Since: 23:30 - 7/5/25
 */

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        rank = rank,
        name = name,
        symbol = symbol,
        marketCapUsd = marketCapUsd,
        priceUsd = priceUsd,
        changePercent24Hr = changePercent24Hr
    )
}

fun CoinPriceDto.toCoinPrice(): CoinPrice {
    return CoinPrice(
        priceUsd = priceUsd,
        dateTime = Instant
            .ofEpochMilli(time)
            .atZone(ZoneId.of("UTC"))
    )
}