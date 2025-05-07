package com.longkd.cryptotracker.crypto.core.domain.util

/**
 * @Author: longkd
 * @Since: 22:11 - 7/5/25
 */
enum class NetworkError : Error {
    REQUEST_TIMEOUT,
    TOO_MANY_REQUESTS,
    NO_INTERNET,
    SERVER_ERROR,
    SERIALIZATION_ERROR,
    UNKNOWN
}