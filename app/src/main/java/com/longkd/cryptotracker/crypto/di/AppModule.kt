package com.longkd.cryptotracker.crypto.di

import com.longkd.cryptotracker.core.data.networking.HttpClientFactory
import com.longkd.cryptotracker.crypto.data.networking.RemoteCoinDataSource
import com.longkd.cryptotracker.crypto.domain.CoinDataSource
import com.longkd.cryptotracker.crypto.presentation.coin_list.CoinListViewModel
import io.ktor.client.engine.cio.CIO
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

/**
 * @Author: longkd
 * @Since: 17:12 - 11/5/25
 */

val appModule = module {
    single { HttpClientFactory.create(CIO.create()) }
    singleOf(::RemoteCoinDataSource).bind<CoinDataSource>()

    viewModelOf(::CoinListViewModel)
}