package com.luigivampa92.testfeature_impl

import android.util.Log
import com.luigivampa92.core.CoreConstants
import com.luigivampa92.testfeature_api.TestFeatureLauncher
import com.yandex.mapkit.MapKitFactory

class TestFeatureLauncherImpl : TestFeatureLauncher {

    override fun launch() {
        val y = MapKitFactory()
        Log.d(CoreConstants.LOG_TAG, "Test feature - real launched!")
    }
}