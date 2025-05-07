package com.longkd.cryptotracker.crypto.core.data.networking

import com.longkd.cryptotracker.BuildConfig

/**
 * @Author: longkd
 * @Since: 22:14 - 7/5/25
 */

fun constructUrl(url: String): String {
    return when {
        url.contains(BuildConfig.BASE_URL) -> url
        url.startsWith("/") -> BuildConfig.BASE_URL + url.drop(1)
        else -> BuildConfig.BASE_URL + url
    }
}