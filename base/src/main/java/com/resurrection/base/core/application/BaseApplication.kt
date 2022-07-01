package com.resurrection.base.core.application

import androidx.multidex.MultiDexApplication
import com.resurrection.base.components.appstate.AppState
import com.resurrection.base.components.dataholder.DataHolderManager
import com.resurrection.base.components.logger.LoggerManager
import com.resurrection.base.components.network.NetworkManager
import com.resurrection.base.components.network.OkHttpClientManager
import com.resurrection.base.components.security.BiometricManager
import com.resurrection.base.components.security.SecurityManager
import com.resurrection.base.components.sharedpreferences.SharedPreferencesManager
import com.resurrection.base.components.typeconverter.TypeConverter
import com.resurrection.base.components.widget.AppLoadingIndicator
import javax.inject.Inject

abstract class BaseApplication : MultiDexApplication() {

    @Inject
    lateinit var appState: AppState

    @Inject
    lateinit var dataHolder: DataHolderManager

    @Inject
    lateinit var sharedPreferences: SharedPreferencesManager

    @Inject
    lateinit var loggerManager: LoggerManager

    @Inject
    lateinit var loadingIndicator: AppLoadingIndicator

    @Inject
    lateinit var networkManager: NetworkManager

    @Inject
    lateinit var securityManager: SecurityManager

    @Inject
    lateinit var biometricManager: BiometricManager

    @Inject
    lateinit var typeConverter: TypeConverter

    @Inject
    lateinit var okHttpClientManager: OkHttpClientManager

    abstract fun init()

    override fun onCreate() {
        super.onCreate()
        init()
    }

}
