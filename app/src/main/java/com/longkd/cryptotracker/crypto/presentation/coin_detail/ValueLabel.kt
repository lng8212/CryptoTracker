package com.longkd.cryptotracker.crypto.presentation.coin_detail

import java.text.NumberFormat

data class ValueLabel(
    val value: Float,
    val unit: String
) {
    fun formatted(): String {
        val formatter = NumberFormat.getNumberInstance(java.util.Locale.getDefault()).apply {
            val fractionDigits = when {
                value > 1000 -> 0
                value in 2f..99f -> 2
                else -> 3
            }
            maximumFractionDigits = fractionDigits
            minimumFractionDigits = 0
        }
        return "${formatter.format(value)}$unit"
    }
}
